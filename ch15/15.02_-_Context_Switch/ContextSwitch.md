How would you measure the time spent in a context switch?

A context switch is the time spent switching between two processes. As two processes cannot run simultaneously on a single CPU core, one process must be put into a waiting/terminated state for another to run. In order to measure the time spent in a context switch, we need to record timestamps of the first and last instruction of the swapping processes. The context switch time is the difference in the timestamps.

Note: There is a massive two page in depth overview of this problem and how exactly you would measure the timestamps in the book.
