/* Una persona tiene una cantidad de dinero en su cuenta bancaria y quiere retirar una cantidad fija cada semana durante un mes. Si la persona tiene inicialmente $1000 en su cuenta y retira $200 cada semana, ¿Cuánto dinero le quedará en su cuenta al final del mes?
*/
public class Withdrawal
{
    public static void main(String[] args) { 
        
        int moneyAccount = 1000;
        final int WITHDRAWAL = 200;
        
        //Semana #1
        moneyAccount -= WITHDRAWAL;
        System.out.println("Saldo de la semana #1: $" + moneyAccount);
        
        //Semana #2
        moneyAccount -= WITHDRAWAL;
        System.out.println("Saldo de la semana #2: $" + moneyAccount);
        
        //Semana #3
        moneyAccount -= WITHDRAWAL;
        System.out.println("Saldo de la semana #3: $" + moneyAccount);
        
        //Semana #4
        moneyAccount -= WITHDRAWAL;
        System.out.println("Saldo de la semana #4: $" + moneyAccount);
        System.out.println();
        
        System.out.println("Saldo al final del mes: $" + moneyAccount);
        
        
    }
}