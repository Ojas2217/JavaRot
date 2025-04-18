![image_2025-03-05_170118542-removebg-preview](https://github.com/user-attachments/assets/d33e69ef-a908-4d50-b18c-5487a362cf60)

# Jort
Jort is a functionally complete[^1] programming language, whose syntax is made up of internet slang/gen-z lingo, it is **NOT** meant for practical use, and was created for fun. Currently i use ANTLR to generate a lexer and parser for the language which translates the language to java code.
[^1]: Or atleast its supposed to be.
# Installation + Usage
First, clone this GitHub repository.
Then, Open a terminal window and navigate to the project folder, now compile the program by running the following command:
```sh
javac -cp "lib/*" -d out src/*.java
```

Now, to actually execute the code, create a `.Jort` file (Or you could use one of the files in the `examples/` folder), write your code and then execute it using
```sh
java -cp "out;lib/*" src/Jort <path-to-your-Jort-file>
```
Replace `<path-to-your-Jort-file>` with the path to your `.Jort` file.

# Syntax
Here are all the keywords used in the language:

| Keyword   | Jort Syntax          |
|-----------|-----------------|
| return    | js gimme my money |
| if        | huzz            |
| else      | bruzz           |
| while     | edge            |
| for       | goon            |
| break     | sybau           |
| continue  | go on           |
| new       | new             |
| print     | prnt            |
| int       | tax             |
| boolean   | ong             |
| void      | gone            |
| char      | chat            |
| String    | Skibidi         |
| double    | tuah            |
| +         | add ts          |
| -         | sub ts          |
| *         | mul ts          |
| /         | div ts          |
| %         | mod ts          |
| ==        | ts eql          |
| <=        | ts les or eql   |
| >=        | ts grtr or eql  |
| <         | ts les          |
| >         | ts grtr         |
| !=        | ts not eql      |
| c++       | c long ahh        |
| c--       | c small ahh       |
| !         | ts nt           |
| &&        | nd              |
| \|\|      | or              |
| =         | ts              |
| ;  | 💔 (although ; works too)             |


Note: Character (chat) uses double quotes\
Note: Integer (tax) is a 32 bit integer\
Note: The language is NOT optimized, recursive methods probably wont do well\
Note: There might be a few bugs (none that i know of), sorry!
