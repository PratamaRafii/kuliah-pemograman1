package main;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import model.Employee;
import model.Student;

public class InheritanceMain {

	public static void main(String[] args ) throws ParseException {
		Student s = new Student();
		s.setNim("4510210038");
		s.setNama("Muhammad Rafii Pratama");
		s.setAlamat("jl . tb simatupang ");
		s.setTglLahir(new SimpleDateFormat ("dd-MM-yyyy").parse ("26-10-1992"));
		s.setNoHp("123456789");
		
		Employee e = new Employee();
		e.setNip("09876545");
		e.setNama("andre villas boas");
		e.setAlamat("jl . london utara ");
		e.setTglLahir(new SimpleDateFormat ("dd-MM-yyyy").parse ("17-10-1977"));
		e.setNoHp("987654321");
		
		showData(s);
		System.out.println("\n==========================================\n");
		showData(e);
	}
	
	static void showData(Student s) {
		System.out.println("Class Student");
		System.out.println("NIM : " + s.getNim());
		System.out.println("Nama: " + s.getNama());
		System.out.println("Alamat : " + s.getAlamat());
		System.out.println("Tgl Lahir : " + new
		SimpleDateFormat("dd MMMM yyyy").format (s.getTglLahir()));
		System.out.println("No HP : " + s.getNoHp());
	}
	
	static void showData(Employee e) {
		System.out.println("Class Employee");
		System.out.println("NIP : " + e.getNip());
		System.out.println("Nama: " + e.getNama());
		System.out.println("Alamat : " + e.getAlamat());
		System.out.println("Tgl Lahir : " + new
		SimpleDateFormat("dd MMMM yyyy").format (e.getTglLahir()));
		System.out.println("No HP : " + e.getNoHp());
		
	}
}