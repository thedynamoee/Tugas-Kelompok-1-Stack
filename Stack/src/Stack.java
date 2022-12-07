import java.util.Scanner;
public class Stack {
    int id,tahun;
    String judul;
    Stack next;
    public static Scanner in = new Scanner(System.in);
    public static Scanner str=new Scanner(System.in);
    public void input(){
        System.out.print("\n\tMasukkan ID buku\t: ");
        id=in.nextInt();
        System.out.print("\tMasukkan judul buku\t: ");
        judul=str.nextLine();
        System.out.print("\tMasukkan tahun terbit\t: ");
        tahun=in.nextInt();
        next=null;
    }
    public void view(){
        System.out.println("\tid buku\t\t: "+id);
        System.out.println("\tjudul\t\t: "+judul);
        System.out.println("\ttahun terbit\t: "+tahun);
    }
    public static void main(String[] args) {
        int menu=0;
        linked st=new linked();
        while(menu!=4){
            System.out.println("\t==============================");
            System.out.println("\t\t|PILIH MENU|  ");
            System.out.println("\t______________________________");
            System.out.println("\t1. Letakkan buku baru");
            System.out.println("\t2. Ambil buku teratas pada tumpukan");
            System.out.println("\t3. Cek Buku pada Tumpukan");
            System.out.println("\t4. Keluar");
            System.out.print("\n\tPilihan: ");
            menu=in.nextInt();
            if(menu==1){
                Stack baru=new Stack();
                baru.input();
                st.push(baru);
            }
            else if(menu==2) st.pop();
            else if(menu==3) st.view();
            else if(menu==4) System.out.println("\n\tSelesai . . .");
            else System.out.println("\n\tPilihan tidak tersedia... Silahkan pilih kembali");
            System.out.println(" ");
        }
    }   
}
class linked{
    Stack top;
    public linked(){
        top=null;
    }
    public void push(Stack baru){
        if(top==null) top=baru;
        else{
            baru.next=top;
            top=baru;
        }
    }
    public void pop(){
        if(top==null) System.out.println("\tTidak ada buku yang tersimpan");
        else{
            System.out.println("\n\tBuku telah diambil");
            top.view();
            top=top.next;
        }
    }
    public void view(){
        if(top==null) System.out.println("\tTidak ada buku yang tersimpan");
        else{
            Stack buku=top;
            while(buku!=null){
                System.out.println("\t- - - - - - - - -");
                buku.view();
                buku=buku.next;
            }
        }
    }
}
