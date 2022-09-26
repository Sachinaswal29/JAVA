// Write a program that reads from a text file char by char and writes in some another file. Write this program in an efficient way. 

import java.io.*;

class Fr {
    public static void main(String args[]) throws IOException {
        FileReader fr = new FileReader("file1.txt");
        BufferedReader br = new BufferedReader(fr);
        FileWriter fw = new FileWriter("file2.txt");
        BufferedWriter bw = new BufferedWriter(fw);
        int i = 0;
        while ((i = br.read()) != -1) {
            bw.write((char) i);
        }
        System.out.println();
        bw.close();
        fw.close();
        br.close();
        fr.close();

    }
}
