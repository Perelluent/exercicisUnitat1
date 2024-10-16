package org.example;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class ProgramaPare {
    public static void main(String[] args) throws IOException {

    Runtime r = Runtime.getRuntime();

    String [] parellSenar = {
            "java",
            "-jar",
            "\"C:\\Users\\morda\\OneDrive\\Escritorio\\Exercicis aprenentatge DAM2\\SERVEIS I PROCESSOS\\ExercicisMultiproces1_ParellSenar\\out\\artifacts\\ExercicisMultiproces1_ParellSenar_jar\\ExercicisMultiproces1_ParellSenar.jar\"",

    };
    Process p = r.exec(parellSenar);

    BufferedReader sortidaProces = new BufferedReader(new InputStreamReader(p.getInputStream()));

        System.out.println(sortidaProces.readLine());

        sortidaProces.close();
    }
}