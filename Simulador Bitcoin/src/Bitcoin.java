
import java.util.Scanner;
public class Bitcoin {


		public static void main(String[] args) {

		Valores meusValores = new Valores();

		meusValores.pagamentos();//Polimorfismo

		try {

		meusValores.setQuantity();//porque o valor precisa de um inteiro para ser inserido, há a chance de o usuário criar um erro.

		System.out.println(meusValores.getQuantidade() + "R$ é a quantia encaminhada para simulação :)");

		} catch (Exception e) {

		System.out.println("Insira um número da pròxima vez");

		} finally {

		System.out.println("\nA Agradecemos por usar nosso simulador! volte sempre\n\n");

		} }

		}

		class Valores {

		public String crop;

		public void setCrop(String crop) {

		this.crop = crop;

		}

		public void pagamentos() {

		System.out.println("Bem vindo(a) ao simulador de Bitcoin Trader");

		}

		public int quantidade;

		public void setQuantity() {

		System.out.print("Qual a quantia necessária para simulação? ");

		Scanner sc = new Scanner(System.in);

		int quantidade = sc.nextInt();

		this.quantidade = quantidade;

		}

		public int getQuantidade() {

		return quantidade;

		}

		}


