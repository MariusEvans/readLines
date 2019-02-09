# readLines
Read specific line(s) from an indicated file, storing the result(s) in a String array.<br />
This is best used for accessing specific records on lines for .txt files. <br />
Lines can be split from these array values. <br />

## Example
int[] linesToRead = {0,1,2}; //first three lines <br />
String[] linesInFile = rl.line("C:\\Users\\Marius Evans\\Desktop\\testFile.txt", linesToRead); <br />
for(int y = 0; y < linesInFile.length; y++) <br />
{ <br />
System.out.println(linesInFile[y]); <br />
}<br />
**Output from file**<br />
This is line 1 <br />
This is line 2<br />
This is line 3<br />

## How to use
1. Import the readLines file. <br />
2. Create a String Array and assign it's value to the method rl.line with your parameters. <br />
The parameters are the file path, and then the index of the line(s) of the file you would like to access. <br />
This index needs to be stored in an int array (allowing mulitple lines to be read separately). <br />
For example, int[] linesToRead = {0,1,2} when passsed as a parameter will read the 1st, 2nd and 3rd lines of the file.<br />
