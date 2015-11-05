for i in testcases/*.java;
do
#echo $i;
        j=`echo $i | sed 's/\([^\/]*\/\)\(.*\)/\2/'`;
        java P5 < $i > testcases/resulting/`echo $j`;
done
cd testcases;
for i in *.java;
do
        javac $i;
        j=`echo $i | sed 's/\([^\/]*\/\)\(.*\)/\2/'`;
        class=`echo $j | sed 's/\([^\.]*\)\(.java\)/\1/'`;
        echo $j;
        java $class > tmpoutput;
        cd resulting;
        javac $i;
        java $class > ../tmpoutput2;
        rm *.class;
        cd ..;
        rm *.class;
        diff tmpoutput2 tmpoutput > /dev/null;
        if [ $? -eq 0 ]
                then
                echo "Successful"
                else
                echo "Failed"
        fi
        rm tmpoutput tmpoutput2
done
cd ~/Desktop/7th-Sem/POPL/Assignment5/testcases/GrammarTester;
for i in ../resulting/*.java;
do
        echo $i;
        java Main < $i;
done
cd ..;

