###The answer to the first question is this:

Thread was interrupted!

Thread will be finished here!!!

###because after the thread was interrupted the interruptedException will pop up
and because we caught it in the catch part it will print Thread was interrupted!
and because the finally part will be always ran it will print Thread will be finished here!!!  

###The answer to the second question is this:

Running in: main

###because when the run method ran it will be ran by the main thread 

###The answer to the third question is this:

Running in: Thread-0

Back to: main

###because the join method puts the main thread in sleep until the current thread ended
and because it creates an interruptedException it will be caught in the catch part so we will see 
Running in: Thread-0  Back to: main





