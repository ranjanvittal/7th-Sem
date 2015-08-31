for i in testcases/*.java;
do
#echo $i;
        j=`echo $i | sed 's/\([^\/]*\/\)\(.*\)/\2/'`;
        java P2 < $i > testcases/resulting/`echo $j`;
done

cd testcases;
for i in *.java;
do
    j=`echo $i | sed 's/\([^\/]*\/\)\(.*\)/\2/'`;
    echo $j;
    class=`echo $j | sed 's/\([^\.]*\)\(.java\)/\1/'`;
    javac $i;
    java $class > tmpoutput;
    diff tmpoutput resulting/`echo $j` > /dev/null;
    if [ $? -eq 0 ]
            then
            echo "Successful"
            else
            echo "Failed"
    fi
done
