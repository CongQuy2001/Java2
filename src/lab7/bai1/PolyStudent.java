/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab7.bai1;



/**
 *
 * @author JosCongQuy
 */
public class PolyStudent {
    public  String Fullname;
    public  Career career ;
   public  void print() {
        System.out.println(">fullname:" + this.Fullname);
        switch (this.career){
        case UDPM:
            System.out.println(">career: Ứng Dụng Phần mềm");
            break;
            case  TKDH:
                System.out.println(">carrer: Thiết Kế Đồ Hoạ");
                case  QTDN:
                System.out.println(">carrer: Quản Trị Doanh Ngiệp");
                    case  SPA:
                System.out.println(">carrer: SPA");
                break;
        }
    }
    public static void main(String[] args) {
        PolyStudent SV = new PolyStudent();
        SV.Fullname = "lò văn tôn";
        SV.career =Career.valueOf( "UDPM");
        SV.print();
    }
}

        
