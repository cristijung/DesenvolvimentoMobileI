/*
  Criar um programa em Java que consiste em uma lista de compras:
- Adicionar itens na lista de compras;
- Consultar itens pelo seu índice;
- Alterar itens da Lista de compras;
- Exibir o tamanho da lista de compras;
- Remover itens da lista de compras;
- Classificar em ordem alfabética
- Limpar a lista de compras
Obs: Criar uma interface que exibe o que está acontecendo com o programa
 */
package Review;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Exercicio05 {

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        ArrayList<String> listaDeCompras = new ArrayList();

        int menu = 0;
        String texto;
        String item;

        do {
            System.out.println("***** Minha Lista de Compras ******");
            System.out.println("Leia com atenção o Menu abaixo"
                    + "1- Adicionar um item \n"
                    + "2- Consulta de item \n"
                    + "3- Alterar um item \n"
                    + "4- Tamanho da lista de compras \n"
                    + "5- Remover um item da lista de compras \n"
                    + "6- Classificar por ordem alfabética as compras \n"
                    + "7- Limpar lista de compras\n"
                    + "8- Sair");
            menu = ler.nextInt();

            switch (menu) {
                case 1:
                    texto = ler.nextLine();
                    System.out.println("*** Digite o item a ser adicionado na Lista de Compras ***");
                    item = ler.nextLine();
                    listaDeCompras.add(item);
                    System.out.println(item + " adicionado com sucesso !");
                    break;

                case 2:
                    System.out.println("== Digite o índice do item ==");
                    int index = ler.nextInt();

                    if (index >= 0 && index < listaDeCompras.size()) {
                        System.out.println("O item do indice " + index
                                + " é: " + listaDeCompras.get(index));
                        System.out.println("Consulta concluida !");
                    } else {
                        System.out.println("Esse indice ainda não existe ! \n"
                                + "Tente novamente !");
                    }
                    break;

                case 3:
                    System.out.println("== Alterar item da lista ==");
                    texto = ler.nextLine();
                    System.out.println("== Digite novo item ==");
                    item = ler.nextLine();
                    System.out.println("== Digite índice do item a ser substituido ! ==");
                    index = ler.nextInt();
                    if (index >= 0 && index < listaDeCompras.size()) {
                        listaDeCompras.set(index, item);
                        System.out.println("O item " + item + " substituido com sucesso !");
                    } else {
                        System.out.println("Esse indice ainda não existe ! \n"
                                + "Tente novamente !");
                    }
                    break;

                case 4:
                    System.out.println("== Tamanha da lista ==");
                    System.out.println("O tamanho da lista é: " + listaDeCompras.size()+ "item");
                    System.out.println("Consulta concluida !");
                    break;

                case 5:
                    System.out.println("== Digite o índice do item para ser Excluido ! ==");
                    index = ler.nextInt();

                    if (index >= 0 && index < listaDeCompras.size()) {
                        listaDeCompras.remove(index);
                        System.out.println("O item removido com sucesso !");
                    } else {
                        System.out.println("Esse indice ainda não existe ! \n"
                                + "Tente novamente !");
                    }
                    break;

                case 6:
                    System.out.println("== Classificar por ordem alfabética ! ==");
                    Collections.sort(listaDeCompras);
                    break;

                case 7:
                    System.out.println("== Limpar Lista ==");
                    listaDeCompras.clear();
                    System.out.println("Lista limpa !");
                    break;

                case 8:
                    System.out.println("== Sair do programa ==");
                    break;

                default:
                    System.out.println("Opção de menu errada ! \n"
                            + "Tente novamente !");
            }

        } while (menu != 8);

    }
}