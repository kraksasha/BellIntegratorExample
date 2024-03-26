package org.example;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        List<Map<String,String>> list = new ArrayList<>();
        Map<String,String> mapName = new HashMap<>();
        Map<String,String> mapAge = new HashMap<>();
        Map<String,String> mapDol = new HashMap<>();
        Map<String,String> mapSalary = new HashMap<>();
        mapName.put("Имя","Кирилл Виталий Александр Дементий");
        mapAge.put("Возраст","26 28 31 35");
        mapDol.put("Должность","Middle Java Dev#Senior Java automation#Junior tester#Dev-ops");
        mapSalary.put("Зарплата","150000руб 2000$ 50000руб 1500$");
        list.add(mapName);
        list.add(mapAge);
        list.add(mapDol);
        list.add(mapSalary);

        List<Integer> list1 = new ArrayList<>();

        // Вывод сотрудников моложе 30
        for (int i = 0; i < list.size(); i++){
            for (Map.Entry<String, String> entry: list.get(i).entrySet()){
                String key = entry.getKey();
                if (key.equals("Возраст")){
                    String age[] = entry.getValue().split(" ");
                    for (int j = 0; j < age.length; j++){
                        if (Integer.parseInt(age[j]) < 30){
                            list1.add(j);
                        }
                    }
                    break;
                }
            }
        }

        for (int i = 0; i < list.size(); i++){
            for (Map.Entry<String, String> entry: list.get(i).entrySet()){
                String key = entry.getKey();
                if (key.equals("Имя")){
                    String name[] = entry.getValue().split(" ");
                    for (int j = 0; j < list1.size(); j++){
                        System.out.println(name[list1.get(j)]);
                    }
                    break;
                }
            }
        }
        //Вывод сотрудников моложе 30

        //Вывод сотрудников получающий зарплату в рублях
        list1 = new ArrayList<>();
        for (int i = 0; i < list.size(); i++){
            for (Map.Entry<String, String> entry: list.get(i).entrySet()){
                String key = entry.getKey();
                if (key.equals("Зарплата")){
                    String salary[] = entry.getValue().split(" ");
                    for (int j = 0; j < salary.length; j++){
                        if (salary[j].contains("руб")){
                            list1.add(j);
                        }
                    }
                    break;
                }
            }
        }

        for (int i = 0; i < list.size(); i++){
            for (Map.Entry<String, String> entry: list.get(i).entrySet()){
                String key = entry.getKey();
                if (key.equals("Имя")){
                    String name[] = entry.getValue().split(" ");
                    for (int j = 0; j < list1.size(); j++){
                        System.out.println(name[list1.get(j)]);
                    }
                    break;
                }
            }
        }
        //Вывод сотрудников получающий зарплату в рублях

        //Вывод среднего возраста сотрудников
        for (int i = 0; i < list.size(); i++){
            for (Map.Entry<String, String> entry: list.get(i).entrySet()){
                String key = entry.getKey();
                if (key.equals("Возраст")){
                    String age[] = entry.getValue().split(" ");
                    int allAge = 0;
                    for (int j = 0; j < age.length; j++){
                        allAge = allAge + Integer.parseInt(age[j]);
                    }
                    int avgAge = allAge/age.length;
                    System.out.println("Средний возраст сотрудников: " +  avgAge);
                    break;
                }
            }
        }
    }
}