package ru.mirea.gibo0119.pr14;

import java.io.*;
import java.nio.charset.*;
import java.nio.file.*;
import java.util.Scanner;

  public class Test {
public static void main(String args[]) throws IOException {
    File file = new File("C:");
    file.createNewFile();

        // Запись в файл введённой с клавиатуры информации

        Scanner sc = new Scanner(System.in);
        System.out.println("Введите текст для записи в файл Lab.txt");
        String txt = sc.nextLine();
        FileWriter wr = new FileWriter("C:");
        wr.write(txt);
        wr.flush();
        wr.close();

        // Вывод информации из файла в консоль

        BufferedReader br = new BufferedReader(new FileReader("C:"));
        for (String line; (line = br.readLine()) != null;) {
        System.out.print(line);
        }
        br.close();

        String filename = "Lab.txt";
        String search = "gib0119";
        String replace = "gib0118";
        Charset charset = StandardCharsets.UTF_8;
        Path path = Paths.get(filename);
        Files.write(path, new String(Files.readAllBytes(path), charset).replace(search, replace) .getBytes(charset));
        }
        }
