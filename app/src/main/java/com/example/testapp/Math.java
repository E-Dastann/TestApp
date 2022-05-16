package com.example.testapp;

public class Math {
    public String add(String a, String b) {
        String result = "";
        if (a.isEmpty() || b.isEmpty()) {
            return "Пусто";
        }
        else if (isNumeric(a) && isNumeric(b)) {
            int num1 = (int) Double.parseDouble(a);
            int num2 = (int) Double.parseDouble(b);
            result = String.valueOf(num1 + num2);
        } else {
            result = "Буквы нельзя";
            System.out.println("Буквы нельзя");
        }
        return result;
    }

    public String divide(String a, String b) {
        String result = "";
        if (b.equals("0") || a.equals("0")) {
            result = "на ноль делить нельзя";
        }
        else if (a.isEmpty() && b.isEmpty()) {
            return "Пусто";
        }
        else if (!isNumeric(a) || !isNumeric(b)) {
            result ="только цифры1";
        }
        else if (Integer.parseInt(a) % 2 == 0 && Integer.parseInt(b) % 2 == 1){
            result = "делить четное на не четное нельзя";
        }
        else if (Integer.parseInt(b) % 2 == 0 && Integer.parseInt(a) % 2 == 1){
            result = "делить не четное на четное нельзя";
        } else if (isNumeric(a) || isNumeric(b)) {
            int num1 = Integer.parseInt(a);
            int num2 = Integer.parseInt(b);
            result = String.valueOf(num1 / num2);
        }
        return result;
    }
    public boolean isNumeric(String strNum) {
        try {
            Double.parseDouble(strNum);
            return true;
        }catch (NumberFormatException e){
            return false;
        }
    }
}
