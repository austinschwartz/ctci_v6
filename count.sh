#echo */*/{*.java,*.c,*.cpp,*.txt} | tr " " "\n" | wc -l | bc | tr -d "\n"
echo */*/* | tr ' ' '\n' | grep -E "((\w*)(java|c|cpp|txt)$)" | wc -l | bc | tr -d "\n"
echo " / 189 problems"
