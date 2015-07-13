Denormalization is where you add redundant information to tables so you can speed up queries by reducing the need for joins. In a normalized database, you would split up information into separate tables and minimize redundant data. Ideally, you may want only one copy of each piece of data in the database.

Cons of Denormalization
* Updates and inserts require putting data into multiple tables and thus are more expensive + harder to write
* Data may get inconistant if you're not adding/inserting/updating correctly. The same data could be in multiple tables with different values
* Higher storage costs

Pros of Denormalization
* Faster Queries since you won't need to join tables
* Queries can be more prone to errors
