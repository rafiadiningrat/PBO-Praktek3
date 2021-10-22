/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dosenasosiasi;

public class mahasiswa {
private String NIM;
private String Nama;
protected String[] KodeMakul=new String[2];
protected String[] NamaMakul=new String[2];
private int jmlMakul=0;

public mahasiswa(String kode){
    this.NIM=kode;
}

public void setNIM (String NIM) {
    this.NIM = NIM;
}

public void setNama(String Nama) {
		this.Nama = Nama;
	}

public void setKodeMakul (String KdMakul) {
    KodeMakul[jmlMakul]=KdMakul;
    jmlMakul++;
}

public void setNamaMakul (String NmMakul) {
    KodeMakul[jmlMakul]=NmMakul;
    jmlMakul++;
}

public int getJmlMakul () {
    return this.jmlMakul;
}

public String getNIM () {
    return this.NIM;
}

public String getnamamahasiswa() {
		return this.Nama;
	}

public void daftarMakul() {
    System.out.println("NIM : " +NIM);
    System.out.println("Nama : " +Nama);
    System.out.println("Daftar Matkul Yang Diambil : ");
        for (int i=0;i<jmlMakul;i++){
                       System.out.println(KodeMakul[i]);
       }

}

}
