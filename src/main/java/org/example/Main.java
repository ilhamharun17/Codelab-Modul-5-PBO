package org.example;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ArrayList<String> mahasiswa = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.print("Masukkan nama ke-" + (mahasiswa.size() + 1) + " (ketik 'selesai' untuk berhenti): ");
            String input = scanner.nextLine();

            if (input.equalsIgnoreCase("selesai")) {
                break;
            }

            if (input.trim().isEmpty()) {
                try {
                    throw new IllegalArgumentException("Nama tidak boleh kosong");
                } catch (IllegalArgumentException e) {
                    System.err.println(e.getMessage());
                    continue;
                }
            }

            mahasiswa.add("Nama ke-" + (mahasiswa.size() + 1) + ": " + input);
        }

        System.out.println("Daftar nama mahasiswa:");
        for (String nama : mahasiswa) {
            System.out.println(nama);
        }
    }
}