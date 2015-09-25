for i in testcases/*.java;
do
#echo $i;
        j=`echo $i | sed 's/\([^\/]*\/\)\(.*\)/\2/'`;
        java P3 < $i > testcases/resulting/`echo $j`;
done

cd testcases;
for i in *.java;
do
    j=`echo $i | sed 's/\([^\/]*\/\)\(.*\)/\2/'`;
    echo $j;
    diff correct_answers/`echo $j` resulting/`echo $j` > /dev/null;
    if [ $? -eq 0 ]
            then
            echo "Successful"
            else
            echo "Failed"
    fi
done
