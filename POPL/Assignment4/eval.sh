for i in testcases/*.scm;
do
#echo $i;
        j=`echo $i | sed 's/\([^\/]*\/\)\(.*\)/\2/'`;
        java P4 < $i > testcases/resulting/`echo $j`;
done

#cd testcases;
#for i in *.scm;
#do
#    j=`echo $i | sed 's/\([^\/]*\/\)\(.*\)/\2/'`;
#    echo $j;
#    diff correct_answers/`echo $j` resulting/`echo $j` > /dev/null;
#    if [ $? -eq 0 ]
#            then
#            echo "Successful"
#            else
#            echo "Failed"
#    fi
#done
