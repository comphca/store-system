package comphca.page;

import java.util.Scanner;

/*
    系统主界面
 */
public class MainPage {
    /*
        入口
     */
    public static void main(String[] args){
        MainPage.mainPage();
    }

    public static void mainPage(){

        Scanner sc = new Scanner(System.in);

        System.out.println("*******************\n");
        System.out.println("\t 1.商品维护\n");
        System.out.println("\t 2.前台收银\n");
        System.out.println("\t 3.商品管理\n");
        System.out.println("*******************");

        System.out.println("请输入选项或者按0退出程序！");
        Integer choice;
        do {
            System.out.println("请输入：");
            choice = Integer.parseInt(sc.next());
            switch (choice){
                case 0:
                    System.out.println("已经退出系统");
                    System.exit(1);
                    break;
                case 1:
                    MaintenancePage();
                    break;
                case 2:
                    break;
                case 3:
                    break;
                default:
                    break;
            }


        }while (true);

    }

    public static void MaintenancePage(){
        System.out.println("********************");
        System.out.println("\t 1.添加商品");
        System.out.println("\t 2.更改商品");
        System.out.println("\t 3.删除商品");
        System.out.println("\t 4.查询商品");
        System.out.println("\t 5.显示所有商品");
        System.out.println("**********************");

        System.out.println("输入选项，或者按0返回上级");

        Integer choice;
        Scanner sc = new Scanner(System.in);
        do {
            choice = Integer.parseInt(sc.next());
            switch (choice){
                case 0:
                    mainPage();
                    break;
                case 1:
                    //GoodsPage.addGoodsPage();
                    break;
                case 2:
                    //GoodsPage.updataGoodsPage();
                    break;
                case 3:
                    break;
                case 4:
                    break;
                case 5:
                    break;
                default:
                    break;
            }
            System.out.println("按0返回上级菜单");
        }while (true);
    }
}


