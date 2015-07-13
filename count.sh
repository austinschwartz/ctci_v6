totals=(9 8 6 12 8 10 9 14 8 11 6 11 8 7 7 26 26)
chapters=(01 02 03 04 05 06 07 08 09 10 11 12 13 14 15 16 17)
name=README.txt
rm ${name}
echo "Cracking the Coding Interview problems\n" >> ${name}
for (( i=0; i<=16; i++  ))
do
  x=`echo */*/* | tr " " "\n" | grep  -E "((ch${chapters[$i]}.*)(java|c|cpp|txt|md|sql)$)" | wc -l | bc`
  echo "ch${chapters[$i]} - ${x} / ${totals[$i]}" >> ${name}
done

total=0
for i in ${totals[@]}; do
  let total+=$i
done

echo "\nTotal" >> ${name}
echo */*/* | tr ' ' '\n' | grep -E "((\w*)(java|c|cpp|txt|md|sql)$)" | wc -l | bc | tr -d "\n" >> ${name}
echo " / ${total} problems\n" >> ${name}

cat ${name}
