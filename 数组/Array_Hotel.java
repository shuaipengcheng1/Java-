package 数组;

public class Array_Hotel {
    //    为一个 酒店写一个程序管理系统 模拟订房 退房 打印所有房间状态
//    用户为酒店前台
//    酒店房间 为2为数组 一维是楼层 二维是房间
//     每一个房间 都应该是一个Room 有类型 编号 是否占用
    public static void main(String[] args) {
//创建一个二维数组
        Room[][] RoomArr = new Room[3][10]; //一共三层 每层10间房
//    开始填充房间信息
//    外层为楼层
        for (int i = 0; i < RoomArr.length; i++) {
//        内层为每一个楼层的房间

            int floor = i + 1;
            for (int j = 0; j < RoomArr[i].length; j++) {

//         房间编号格式 楼层 0 房号  类型是偶数为vip 单数为普通 房间订购 为取随机数0-10 如果比5小 为false 否则为true
                RoomArr[i][j] = new Room(floor + "0" + j, j % 2 == 0 ? "vip" : "normal", Math.floor(Math.random() * 10) < 5 ? false : true);
            }
        }
//    打印每一个房间状况
        for (int i = 0; i < RoomArr.length; i++) {
            System.out.print(" ");
            System.out.println(i + 1 + "层" + "--------------------------------房间---------------------------------");

            for (int j = 0; j < RoomArr[i].length; j++) {
//            判断是否为Room 对象
                if (RoomArr[i][j] instanceof Room) {
                    System.out.println(" 编号 " + RoomArr[i][j].No + " 类型 " + RoomArr[i][j].type + " 是否有人 " + RoomArr[i][j].Free);
                }

            }
        }
        System.out.println("--------------------------------房间---------------------------------");
//创键一个人的实例
        Peple misaka = new Peple("misaka", "18", "男");

//    获取可用的房间
        Room.getFreeHome(RoomArr);
//订房
        Room.intoHome(RoomArr, "302", misaka);

    }
}

class Peple {
    public Peple(String name, String age, String gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
    }

    String name;
    String age;
    String gender;
}

class Room {
    public Room(String no, String type, boolean free) {
        No = no;
        this.type = type;
        Free = free;
    }

    //    编号
    String No;
    //    类型
    String type;
    //    是否占用 默认值 为 false
    boolean Free = false;
    //客户
    Peple p;

    //    订房操作
    static void getFreeHome(Room[][] RoomArr) {
        System.out.println("--------------------------------可以使用的房间---------------------------------");
        for (int i = 0; i < RoomArr.length; i++) {
            System.out.print(" ");
            for (int j = 0; j < RoomArr[i].length; j++) {
//            判断是否为Room 对象
                if (RoomArr[i][j] instanceof Room) {
//                  如果为true
                    if (RoomArr[i][j].Free) {
                        System.out.println(" 编号 " + RoomArr[i][j].No + " 类型 " + RoomArr[i][j].type + " 是否有人 " + RoomArr[i][j].Free);
                    }
                }


            }

        }
        System.out.println("--------------------------------可以使用的房间---------------------------------");


    }

    // 订房\
    static void intoHome(Room[][] arr, String id, Peple p) {
//     传入id
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (arr[i][j] instanceof Room) {
//    找到用户指定的房间
                    if (arr[i][j].No.equals(id)) {
//                        是否为空
                        if (arr[i][j].Free) {
//                            将人的信息赋值
                            arr[i][j].p = p;
                            System.out.println("订房成功" + "类型为" + arr[i][j].type + "价格为" + (arr[i][j].type.equals("vip") ? 500 : 300) + "客户姓名为" + arr[i][j].p.name);
                            break;
                        } else {
                            System.out.println("订房失败" + id);
//        调用可以使用的房间方法
                            Room.getFreeHome(arr);
                            break;
                        }
                    }

                }
            }
        }
    }
}
