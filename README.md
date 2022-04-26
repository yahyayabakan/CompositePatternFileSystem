# CompositePatternFileSystem
Description
• Title: Composite Pattern File System
• Deadline: 4:30pm on Friday February 11th 2022
• Contribution to final course mark: 25%
• Solo or Group: Solo work
• Anticipated Hours: 3
Specifcation
You are to build a simplified file management system using the composite design pattern. Within your system, you
can store files and directories. Directories can include other directories and/or files. All files and directories are
within one top directory. The file system needs to be able to do the following:
• Add a file/directory to a given directory, using method void add(Component).
• Remove a file/directory from a given directory, using method void remove(Component).
• Display a directory and all of its contents: name and size of each of its contents, whether file or directory.
• Get the size of a directory as the total size of the files within it.
• Search for a directory containing a file with a certain name. If more than one is found, only the first directory
is to be returned. File name is to be matched exactly and is case-sensitive. You can only search for file names
and not directory names.