Whats the difference between a thread and a process?

Processes and threads are fundamentally different. A process can be thought of as an instance of a program in execution. That process may have multiple threads running under it. Communication between threads is much simpler than between processes, since the threads within a process share resources. There are various ways for one process to access another's resources: pipes, sockets, files, etc.
