import java.util.Scanner;

public class OOXX {
public static void main (String args []){
    Scanner sc = new Scanner(System.in);
boolean win =false ;
int data [][]=new int[3][3];
for (int i=0;i<3;i++){
for (int j=0;j<3;j++){
data [i][j]= sc.nextInt();
}
}
if (data[0][0]==data[0][1]&&data[0][1]==data[0][2])
{win=true;}
if (data[1][0]==data[1][1]&&data[1][1]==data[1][2])
    {win=true;}
    if (data[2][0]==data[2][1]&&data[2][1]==data[2][2])
    {win=true;}
    if (data[0][0]==data[1][0]&&data[1][0]==data[2][0])
    {win=true;}
    if (data[0][1]==data[1][1]&&data[1][1]==data[2][1])
    {win=true;}
    if (data[0][2]==data[1][2]&&data[1][2]==data[2][2])
    {win=true;}
if (win==true)
{System.out.println("true");}
else
{System.out.println("false"); }
    }
}
