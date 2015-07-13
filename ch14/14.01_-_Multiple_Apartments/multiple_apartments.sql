SELECT TenantName
FROM Tenants
INNER JOIN (SELECT TenantID
            FROM AptTenants
            GROUP BY TenantID
            HAVING count(*) > 1) A
ON Tenants.TenantID = A.TenantID
