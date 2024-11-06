// 12S24044 DIANITA LORENSIA BR GINTING
// 12S24051 GERALDA NATALI GULTOM
import java.util.*;
import java.lang.Math;

public class T04 {
    private static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        String[] iSBN = new String[3];
        double[] price = new double[3];
        int[] quantity = new int[3];
        double totalBookPrice;
        double[] bookPrice = new double[3];
        String quantityBook;
        int n, quantityBook0, quantityBook1, quantityBook2;
        double bookPrice0, bookPrice1, bookPrice2;

        bookPrice[0] = 0;
        bookPrice[1] = 0;
        bookPrice[2] = 0;
        n = 0;
        price[0] = 0;
        price[1] = 0;
        price[2] = 0;
        quantity[0] = 0;
        quantity[1] = 0;
        quantity[2] = 0;
        quantityBook0 = 0;
        quantityBook1 = 0;
        quantityBook2 = 0;
        String book0, book1, book2;
        int zero, one, two;

        zero = 0;
        one = 1;
        two = 2;
        while (n < 3) {
            iSBN[n] = input.nextLine();
            if (iSBN[n].equals("---")) {
                n = 3;
            } else {
                if (iSBN[n].equals(iSBN[0])) {
                    if (zero == 0) {
                        book0 = iSBN[n];
                    }
                    if (iSBN[0].equals(book0)) {
                        n = 0;
                        price[n] = Double.parseDouble(input.nextLine());
                        quantity[n] = Integer.parseInt(input.nextLine());
                        quantityBook0 = quantityBook0 + quantity[n];
                        zero = 3;
                        n = n + 1;
                    } else {
                        if (one == 1) {
                            book1 = iSBN[n];
                        }
                        if (iSBN[0].equals(book1)) {
                            n = 1;
                            price[n] = Double.parseDouble(input.nextLine());
                            quantity[n] = Integer.parseInt(input.nextLine());
                            quantityBook1 = quantityBook1 + quantity[n];
                            zero = 3;
                            n = n + 1;
                        } else {
                            n = 2;
                            price[n] = Double.parseDouble(input.nextLine());
                            quantity[n] = Integer.parseInt(input.nextLine());
                            quantityBook2 = quantityBook2 + quantity[n];
                            zero = 3;
                            n = 0;
                        }
                    }
                } else {
                    if (iSBN[n].equals(iSBN[1])) {
                        if (one == 1) {
                            book1 = iSBN[n];
                        }
                        if (iSBN[1].equals(book1)) {
                            n = 1;
                            price[n] = Double.parseDouble(input.nextLine());
                            quantity[n] = Integer.parseInt(input.nextLine());
                            quantityBook1 = quantityBook1 + quantity[n];
                            one = 3;
                            n = n + 1;
                        } else {
                            n = 2;
                            price[n] = Double.parseDouble(input.nextLine());
                            quantity[n] = Integer.parseInt(input.nextLine());
                            quantityBook2 = quantityBook2 + quantity[n];
                            one = 3;
                            n = 0;
                        }
                    } else {
                        if (iSBN[n].equals(iSBN[2])) {
                            if (two == 2) {
                                book2 = iSBN[n];
                            }
                            if (iSBN[2].equals(book2)) {
                                n = 2;
                                price[n] = Double.parseDouble(input.nextLine());
                                quantity[n] = Integer.parseInt(input.nextLine());
                                quantityBook2 = quantityBook2 + quantity[n];
                                two = 3;
                                n = 0;
                            }
                        }
                    }
                }
            }
        }
        if (quantityBook0 >= 20) {
            price[0] = price[0] - price[0] * 12 / 100;
        } else {
            if (quantityBook0 >= 10) {
                price[0] = price[0] - price[0] * 5 / 100;
            } else {
                if (quantityBook0 >= 5) {
                    price[0] = price[0] - price[0] * 2 / 100;
                }
            }
            bookPrice[0] = price[0] * quantityBook0;
            if (quantityBook1 >= 20) {
                price[1] = price[1] - price[1] * 12 / 100;
            } else {
                if (quantityBook1 >= 10) {
                    price[1] = price[1] - price[1] * 5 / 100;
                } else {
                    if (quantityBook1 >= 5) {
                        price[1] = price[1] - price[1] * 2 / 100;
                    }
                }
            }
        }
        bookPrice[1] = price[1] * quantityBook1;
        if (quantityBook2 >= 20) {
            price[2] = price[2] - price[2] * 12 / 100;
        } else {
            if (quantityBook2 >= 10) {
                price[2] = price[2] - price[2] * 5 / 100;
            } else {
                if (quantityBook2 >= 5) {
                    price[2] = price[2] - price[2] * 2 / 100;
                }
            }
        }
        bookPrice[2] = price[2] * quantityBook2;
        totalBookPrice = bookPrice[0] + bookPrice[1] + bookPrice[2];
        System.out.println(toFixed(totalBookPrice,2));
    }
    
    private static String toFixed(double value, int digits) {
        return String.format("%." + digits + "f", value);
    }
}
