//package com.tata.lon.loan_service;
//
//import org.springframework.boot.autoconfigure.SpringBootApplication;
//
//import java.util.ArrayList;
//import java.util.List;
//
//@SpringBootApplication
//public class LoanServiceProjectApplicationTest {
//
//    public static void main(String[] args) {
////		SpringApplication.run(LoanServiceProjectApplication.class, args);
//
//
//        System.out.println("salam");
//
//
////        int i = steadyGene("actgaaag");
//        int i = steadyGene("TGATGCCGTCCCCTCAACTTGAGTGCTCCTAATGCGTTGC");
////        int i = steadyGene("GAAATAAA");
////        int i = steadyGene("gaaataaa");
//        System.out.println(i);
//
//
//    }
//
//
//    public static int steadyGene(String gene) {
//
//        int n = gene.length();
//        int expectedCount = n / 4;
//        char[] genChars = gene.toCharArray();
//
//        //a=0,c=1,t=2,g=3
//        List<List<Integer>> charArr = new ArrayList<>();
//        for (int k = 0; k < 4; k++)
//            charArr.add(new ArrayList<>());
//        int[] exceededCharArr = new int[4];
//        boolean steady = Boolean.TRUE;
//        for (int i = 0; i < n; i++) {
//
//            if (genChars[i] == 'A') {
//                charArr.get(0).add(i);
//                if (charArr.get(0).size() > expectedCount) {
//                    steady = Boolean.FALSE;
//                    exceededCharArr[0]++;
//
//                }
//
//            } else if (genChars[i] == 'C') {
//                charArr.get(1).add(i);
//
//                if (charArr.get(1).size() > expectedCount) {
//                    steady = Boolean.FALSE;
//                    exceededCharArr[1]++;
//                }
//            } else if (genChars[i] == 'T') {
//                charArr.get(2).add(i);
//
//                if (charArr.get(2).size() > expectedCount) {
//                    steady = Boolean.FALSE;
//                    exceededCharArr[2]++;
//
//                }
//            } else if (genChars[i] == 'G') {
//                charArr.get(3).add(i);
//
//                if (charArr.get(3).size() > expectedCount) {
//                    steady = Boolean.FALSE;
//                    exceededCharArr[3]++;
//
//                }
//            }
//
//
//        }
//        if (steady)
//            return 0;
//        charArr.sort((o1, o2) -> {
//            if (o1.size() < o2.size()) return 1;
//            else if (o1.size() == o2.size())
//                return 0;
//            else
//                return -1;
//        });
//
//        int s = 1;
//        if (charArr.get(0).size() > expectedCount) {
//            int diff = charArr.get(0).size() - expectedCount;
//            int first = charArr.get(0).get(0);
//            int last = charArr.get(0).get(0+diff-1);
//            while (s < charArr.size() - 1) {
//                if (charArr.get(s).size() > expectedCount){
//
//
//                }
//
//
//
//s++;
//            }
//        }
//        int m = 0;
//        int s = 0;
//        int first = n;
//        int last = 0;
//        int min = n;
//        boolean end = false;
//        while (!end) {
//            while (s < charArr.size() - 1 && !end) {
//                if (charArr.get(s).size() > expectedCount) {
//                    if (m > charArr.get(s).size() - 1)
//                        end = true;
//                    else {
//                        if (m < charArr.get(s).size() - 1 && charArr.get(s).get(m) < first) {
//                            first = charArr.get(s).get(m);
//
//
//                        }
//                        int diff = charArr.get(s).size() - expectedCount;
//                        if ((m + diff - 1) < charArr.get(s).size() && charArr.get(s).get(m + diff - 1) > last)
//                            last = charArr.get(s).get(m + diff - 1);
//
//
//                    }
//                }
//                s++;
//            }
//            if (!end && (last - first + 1) < min)
//                min = last - first + 1;
//            m++;
//            s = 0;
//            first = n;
//            last = 0;
//        }
//        return min;
//    }
//
//}
