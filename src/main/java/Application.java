import java.util.Scanner;

public class Application {

    public static void prikazIgre(String r1, String r2, String r3, String rL, String r11, String r22, String r33) {
        System.out.println(r1 + "     " + r11);
        System.out.println(rL + "     " + rL);
        System.out.println(r2 + "     " + r22);
        System.out.println(rL + "     " + rL);
        System.out.println(r3 + "     " + r33);
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Welcome to tic-tac-toe game!");


        String row1 = "   |   |   ";
        String row2 = "   |   |   ";
        String row3 = "   |   |   ";
        String row11 = row1.substring(0, 1) + "1" + row1.substring(2, 5) + "2" + row1.substring(6, 9) + "3" + row1.substring(10);
        String row22 = row2.substring(0, 1) + "4" + row2.substring(2, 5) + "5" + row2.substring(6, 9) + "6" + row2.substring(10);
        ;
        String row33 = row3.substring(0, 1) + "7" + row3.substring(2, 5) + "8" + row3.substring(6, 9) + "9" + row3.substring(10);
        ;
        String rowLine = "---|---|---";

        prikazIgre(row1, row2, row3, rowLine, row11, row22, row33);
//        System.out.println(row1 + "     " + row11);
//        System.out.println(rowLine + "     " + rowLine);
//        System.out.println(row2 + "     " + row22);
//        System.out.println(rowLine + "     " + rowLine);
//        System.out.println(row3 + "     " + row33);


        char x = 'x';
        char o = 'o';
        char y;
        boolean tr = true;

        y = x;
        System.out.println("Unesi ime igraca 1: ");
        String igrac1 = s.next();
        System.out.println("Unesi ime igraca 2: ");
        String igrac2 = s.next();
        while (igrac2.equalsIgnoreCase(igrac1)) {
            System.out.println("Ime je zauzeto. Igrac 2 mora da izabere drugo ime za igricu: ");
            igrac2 = s.next();
        }
        String igrac = igrac1;

        System.out.println(igrac + " na potezu: ");
        int play = s.nextInt();

        while (tr) {
            switch (play) {
                case 1:
                    if (row1.charAt(1) == ' ') {
                        row1 = row1.substring(0, 1) + y + row1.substring(2);
                        prikazIgre(row1, row2, row3, rowLine, row11, row22, row33);
                        if (row1.charAt(5) == y && row1.charAt(9) == y || (row2.charAt(1) == y && row3.charAt(1) == y) || (row2.charAt(5) == y && row3.charAt(9) == y)) {
                            System.out.println(igrac + " je pobednik!");
                            tr = false;
                            break;
                        }
                        if (y == x) {
                            y = o;
                            igrac = igrac2;
                        } else {
                            y = x;
                            igrac = igrac1;
                        }
                    } else {
                        System.out.println("Popunjeno polje. Izaberi drugo.");
                    }
                    if (row1.charAt(1) != ' ' && row1.charAt(5) != ' ' && row1.charAt(9) != ' ' && row2.charAt(1) != ' ' &&
                            row2.charAt(5) != ' ' && row2.charAt(9) != ' ' && row3.charAt(1) != ' ' && row3.charAt(5) != ' ' &&
                            row3.charAt(9) != ' ') {
                        System.out.println("Nema pobednika! Kraj igre.");
                        tr = false;
                        break;
                    }

                    System.out.println(igrac + " igra sledeci potez: ");
                    play = s.nextInt();
                    break;
                case 2:
                    if (row1.charAt(5) == ' ') {
                        row1 = row1.substring(0, 5) + y + row1.substring(6);
                        prikazIgre(row1, row2, row3, rowLine, row11, row22, row33);
                        if (row1.charAt(1) == y && row1.charAt(9) == y || (row2.charAt(5) == y && row3.charAt(5) == y)) {
                            System.out.println(igrac + " je pobednik!");
                            tr = false;
                            break;
                        }
                        if (y == x) {
                            y = o;
                            igrac = igrac2;
                        } else {
                            y = x;
                            igrac = igrac1;
                        }
                    } else {
                        System.out.println("Popunjeno polje. Izaberi drugo.");
                    }
                    if (row1.charAt(1) != ' ' && row1.charAt(5) != ' ' && row1.charAt(9) != ' ' && row2.charAt(1) != ' ' &&
                            row2.charAt(5) != ' ' && row2.charAt(9) != ' ' && row3.charAt(1) != ' ' && row3.charAt(5) != ' ' &&
                            row3.charAt(9) != ' ') {
                        System.out.println("Nema pobednika! Kraj igre.");
                        tr = false;
                        break;
                    }

                    System.out.println(igrac + " igra sledeci potez: ");
                    play = s.nextInt();
                    break;
                case 3:
                    if (row1.charAt(9) == ' ') {
                        row1 = row1.substring(0, 9) + y + row1.substring(10);
                        prikazIgre(row1, row2, row3, rowLine, row11, row22, row33);
                        if (row1.charAt(1) == y && row1.charAt(5) == y || (row2.charAt(5) == y && row3.charAt(1) == y) || (row2.charAt(9) == y && row3.charAt(9) == y)) {
                            System.out.println(igrac + " je pobednik!");
                            tr = false;
                            break;
                        }
                        if (y == x) {
                            y = o;
                            igrac = igrac2;
                        } else {
                            y = x;
                            igrac = igrac1;
                        }
                    } else {
                        System.out.println("Popunjeno polje. Izaberi drugo.");
                    }
                    if (row1.charAt(1) != ' ' && row1.charAt(5) != ' ' && row1.charAt(9) != ' ' && row2.charAt(1) != ' ' &&
                            row2.charAt(5) != ' ' && row2.charAt(9) != ' ' && row3.charAt(1) != ' ' && row3.charAt(5) != ' ' &&
                            row3.charAt(9) != ' ') {
                        System.out.println("Nema pobednika! Kraj igre.");
                        tr = false;
                        break;
                    }

                    System.out.println(igrac + " igra sledeci potez: ");
                    play = s.nextInt();
                    break;
                case 4:
                    if (row2.charAt(1) == ' ') {
                        row2 = row2.substring(0, 1) + y + row2.substring(2);
                        prikazIgre(row1, row2, row3, rowLine, row11, row22, row33);
                        if (row1.charAt(1) == y && row3.charAt(1) == y || (row2.charAt(5) == y && row2.charAt(9) == y)) {
                            System.out.println(igrac + " je pobednik!");
                            tr = false;
                            break;
                        }
                        if (y == x) {
                            y = o;
                            igrac = igrac2;
                        } else {
                            y = x;
                            igrac = igrac1;
                        }
                    } else {
                        System.out.println("Popunjeno polje. Izaberi drugo.");
                    }
                    if (row1.charAt(1) != ' ' && row1.charAt(5) != ' ' && row1.charAt(9) != ' ' && row2.charAt(1) != ' ' &&
                            row2.charAt(5) != ' ' && row2.charAt(9) != ' ' && row3.charAt(1) != ' ' && row3.charAt(5) != ' ' &&
                            row3.charAt(9) != ' ') {
                        System.out.println("Nema pobednika! Kraj igre.");
                        tr = false;
                        break;
                    }

                    System.out.println(igrac + " igra sledeci potez: ");
                    play = s.nextInt();
                    break;
                case 5:
                    if (row2.charAt(5) == ' ') {
                        row2 = row2.substring(0, 5) + y + row2.substring(6);
                        prikazIgre(row1, row2, row3, rowLine, row11, row22, row33);
                        if (row1.charAt(1) == y && row3.charAt(9) == y || (row2.charAt(1) == y && row2.charAt(9) == y) || row1.charAt(5) == y && row3.charAt(5) == y || (row1.charAt(9) == y && row3.charAt(1) == y)) {
                            System.out.println(igrac + " je pobednik!");
                            tr = false;
                            break;
                        }
                        if (y == x) {
                            y = o;
                            igrac = igrac2;
                        } else {
                            y = x;
                            igrac = igrac1;
                        }
                    } else {
                        System.out.println("Popunjeno polje. Izaberi drugo.");
                    }
                    if (row1.charAt(1) != ' ' && row1.charAt(5) != ' ' && row1.charAt(9) != ' ' && row2.charAt(1) != ' ' &&
                            row2.charAt(5) != ' ' && row2.charAt(9) != ' ' && row3.charAt(1) != ' ' && row3.charAt(5) != ' ' &&
                            row3.charAt(9) != ' ') {
                        System.out.println("Nema pobednika! Kraj igre.");
                        tr = false;
                        break;
                    }

                    System.out.println(igrac + " igra sledeci potez: ");
                    play = s.nextInt();
                    break;
                case 6:
                    if (row2.charAt(9) == ' ') {
                        row2 = row2.substring(0, 9) + y + row2.substring(10);
                        prikazIgre(row1, row2, row3, rowLine, row11, row22, row33);
                        if (row1.charAt(9) == y && row3.charAt(9) == y || (row2.charAt(1) == y && row2.charAt(5) == y)) {
                            System.out.println(igrac + " je pobednik!");
                            tr = false;
                            break;
                        }
                        if (y == x) {
                            y = o;
                            igrac = igrac2;
                        } else {
                            y = x;
                            igrac = igrac1;
                        }
                    } else {
                        System.out.println("Popunjeno polje. Izaberi drugo.");
                    }
                    if (row1.charAt(1) != ' ' && row1.charAt(5) != ' ' && row1.charAt(9) != ' ' && row2.charAt(1) != ' ' &&
                            row2.charAt(5) != ' ' && row2.charAt(9) != ' ' && row3.charAt(1) != ' ' && row3.charAt(5) != ' ' &&
                            row3.charAt(9) != ' ') {
                        System.out.println("Nema pobednika! Kraj igre.");
                        tr = false;
                        break;
                    }

                    System.out.println(igrac + " igra sledeci potez: ");
                    play = s.nextInt();
                    break;
                case 7:
                    if (row3.charAt(1) == ' ') {
                        row3 = row3.substring(0, 1) + y + row3.substring(2);
                        prikazIgre(row1, row2, row3, rowLine, row11, row22, row33);
                        if (row1.charAt(1) == y && row2.charAt(1) == y || (row1.charAt(9) == y && row2.charAt(5) == y) || (row3.charAt(5) == y && row3.charAt(9) == y)) {
                            System.out.println(igrac + " je pobednik!");
                            tr = false;
                            break;
                        }
                        if (y == x) {
                            y = o;
                            igrac = igrac2;
                        } else {
                            y = x;
                            igrac = igrac1;
                        }
                    } else {
                        System.out.println("Popunjeno polje. Izaberi drugo.");
                    }
                    if (row1.charAt(1) != ' ' && row1.charAt(5) != ' ' && row1.charAt(9) != ' ' && row2.charAt(1) != ' ' &&
                            row2.charAt(5) != ' ' && row2.charAt(9) != ' ' && row3.charAt(1) != ' ' && row3.charAt(5) != ' ' &&
                            row3.charAt(9) != ' ') {
                        System.out.println("Nema pobednika! Kraj igre.");
                        tr = false;
                        break;
                    }

                    System.out.println(igrac + " igra sledeci potez: ");
                    play = s.nextInt();
                    break;
                case 8:
                    if (row3.charAt(5) == ' ') {
                        row3 = row3.substring(0, 5) + y + row3.substring(6);
                        prikazIgre(row1, row2, row3, rowLine, row11, row22, row33);
                        if (row1.charAt(5) == y && row2.charAt(5) == y || (row3.charAt(1) == y && row3.charAt(9) == y)) {
                            System.out.println(igrac + " je pobednik!");
                            tr = false;
                            break;
                        }
                        if (y == x) {
                            y = o;
                            igrac = igrac2;
                        } else {
                            y = x;
                            igrac = igrac1;
                        }
                    } else {
                        System.out.println("Popunjeno polje. Izaberi drugo.");
                    }
                    if (row1.charAt(1) != ' ' && row1.charAt(5) != ' ' && row1.charAt(9) != ' ' && row2.charAt(1) != ' ' &&
                            row2.charAt(5) != ' ' && row2.charAt(9) != ' ' && row3.charAt(1) != ' ' && row3.charAt(5) != ' ' &&
                            row3.charAt(9) != ' ') {
                        System.out.println("Nema pobednika! Kraj igre.");
                        tr = false;
                        break;
                    }

                    System.out.println(igrac + " igra sledeci potez: ");
                    play = s.nextInt();
                    break;
                case 9:
                    if (row3.charAt(9) == ' ') {
                        row3 = row3.substring(0, 9) + y + row3.substring(10);
                        prikazIgre(row1, row2, row3, rowLine, row11, row22, row33);
                        if (row1.charAt(1) == y && row2.charAt(5) == y || (row3.charAt(1) == y && row3.charAt(5) == y) || (row1.charAt(9) == y && row2.charAt(9) == y)) {
                            System.out.println(igrac + " je pobednik!");
                            tr = false;
                            break;
                        }
                        if (y == x) {
                            y = o;
                            igrac = igrac2;
                        } else {
                            y = x;
                            igrac = igrac1;
                        }
                    } else {
                        System.out.println("Popunjeno polje. Izaberi drugo.");
                    }
                    if (row1.charAt(1) != ' ' && row1.charAt(5) != ' ' && row1.charAt(9) != ' ' && row2.charAt(1) != ' ' &&
                            row2.charAt(5) != ' ' && row2.charAt(9) != ' ' && row3.charAt(1) != ' ' && row3.charAt(5) != ' ' &&
                            row3.charAt(9) != ' ') {
                        System.out.println("Nema pobednika! Kraj igre.");
                        tr = false;
                        break;
                    }

                    System.out.println(igrac + " igra sledeci potez: ");
                    play = s.nextInt();
                    break;
                default:
                    System.out.println("Ponovi potez. Biraj izmedju polja od 1 do 9");
                    prikazIgre(row1, row2, row3, rowLine, row11, row22, row33);

                    System.out.println(igrac + " igra sledeci potez: ");
                    play = s.nextInt();
                    break;
            }
        }


    }
}
