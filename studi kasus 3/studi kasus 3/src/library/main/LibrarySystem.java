package library.main;

import library.model.Book;
import library.model.Member;
import java.util.ArrayList;
import java.util.Scanner;

public class LibrarySystem {
    private ArrayList<Book> books;
    private ArrayList<Member> members;

    public LibrarySystem() {
        books = new ArrayList<Book>();
        members = new ArrayList<Member>();
    }

    public void addBook(Book book) {
        books.add(book);
    }

    public void addMember(Member member) {
        members.add(member);
    }

    public void displayBooks() {
        System.out.println("Daftar Buku:");
        for (int i = 0; i < books.size(); i++) {
            System.out.println("- " + books.get(i).getBookInfo());
        }
    }

    public void displayMembers() {
        System.out.println("Daftar Anggota:");
        for (int i = 0; i < members.size(); i++) {
            System.out.println("- " + members.get(i).getMemberInfo());
        }
    }

    public static void main(String[] args) {
        LibrarySystem system = new LibrarySystem();
        Scanner scanner = new Scanner(System.in);
        int choice = -1;

        System.out.println("--- Sistem Manajemen Perpustakaan ---");

        while (choice != 0) {
            System.out.println("\nMenu:");
            System.out.println("1. Tambah Buku");
            System.out.println("2. Tambah Anggota");
            System.out.println("3. Tampilkan Daftar Buku");
            System.out.println("4. Tampilkan Daftar Anggota");
            System.out.println("0. Keluar");
            System.out.print("Pilih: ");
            choice = scanner.nextInt();
            scanner.nextLine(); 

            if (choice == 1) {
                System.out.print("Judul: ");
                String title = scanner.nextLine();
                System.out.print("Penulis: ");
                String author = scanner.nextLine();
                System.out.print("Tahun Terbit: ");
                int year = scanner.nextInt();
                scanner.nextLine();

                Book newBook = new Book(title, author, year);
                system.addBook(newBook);
                System.out.println("Buku berhasil ditambahkan.");
            } else if (choice == 2) {
                System.out.print("Nama Anggota: ");
                String name = scanner.nextLine();
                System.out.print("ID Anggota: ");
                String id = scanner.nextLine();

                Member newMember = new Member(name, id);
                system.addMember(newMember);
                System.out.println("Anggota berhasil ditambahkan.");
            } else if (choice == 3) {
                system.displayBooks();
            } else if (choice == 4) {
                system.displayMembers();
            } else if (choice == 0) {
                System.out.println("Keluar dari sistem");
            } else {
                System.out.println("Pilihan tidak valid.");
            }
        }

        scanner.close();
    }
}
