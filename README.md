![image_2025-03-05_170118542-removebg-preview](https://github.com/user-attachments/assets/d33e69ef-a908-4d50-b18c-5487a362cf60)

# JavaRot
JavaRot is a functionally complete[^1] programming language, whose syntax is made up of internet slang/gen-z lingo, it is **NOT** meant for practical use, and was created for fun. Currently i use ANTLR to generate a lexer and parser for the language which translates the language to java code, making this a fancy way to code in java.
[^1]: Or atleast its supposed to be.
# Installation + Usage
First, clone this GitHub repository.
Then, Open a terminal window and navigate to the project folder, now compile the program by running the following command:
```sh
javac -cp "lib/*" -d out src/*.java
```

Now, to actually execute the code, create a `.JavaRot` file (Or you could use one of the files in the `examples/` folder), write your code and then execute it using
```sh
java -cp "out;lib/*" src/JavaRot <path-to-your-JavaRot-file>
```
Replace `<path-to-your-JavaRot-file>` with the path to your `.JavaRot` file.
