package readlines;

import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Marius Evans
 */
public class readLines
{
    public String[] line(String filePath, int[] index)
    //read specific line(s) from file
    {
        ArrayList<String> line = new ArrayList<String>(); //dynamic, read multiple lines from index int array
        Path fileDirectory = Paths.get(filePath);
        //e.g. C:\\Users\\Marius Evans\\Desktop\\testFile.txt
        try
        {
            List<String> lines = Files.readAllLines(fileDirectory, StandardCharsets.UTF_8);
            for(int i = 0; i<index.length; i++)
            {
               if(i>0)
               {
                   line.add(lines.get(index[i]));
               }
                else
                {
                   line.add(lines.get(index[0]));
                }
            }
        }
        catch(Exception e)
        {
            System.out.println("Error getting line, line may not exist, file path may be incorrect");
            e.printStackTrace();
        }
        
        //convert dynamic ArrayList to String[] for conversion to return
        String[] linesRead = new String[line.size()];
        linesRead = line.toArray(linesRead);
        return linesRead;
    }
    
    public static void main(String[] args)
    {
        System.out.println("Running readLines.java");
        readLines rl = new readLines();
    }
    
}
