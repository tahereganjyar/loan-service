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
//
//        int min = n;
//        int temp = 0;
//        int firstIndex = 0;
//        int lastIndex = n;
//        int s = 0;
//
//        while (s < charArr.size()) {
//            if (charArr.get(s).size() > expectedCount) {
//                int firstDiff = charArr.get(s).size() - expectedCount;
//
//                for (int i=0;i<firstDiff-1;i++)
//                {
//
//                    int m=s+1;
//                    if (m<charArr.size()-1 && charArr.get(m).size() > expectedCount)
//                    {
//                        int secondDiff = charArr.get(m).size() - expectedCount;
//
//                        f
//
//                        for (int j=0;j<secondDiff-1;j++)
//                        {
//
//                            if (charArr.get(m).get(j) < firstIndex)
//                                firstIndex = charArr.get(m).get(j);
//                            if (charArr.get(m).get(j + secondDiff - 1) > lastIndex)
//                                lastIndex = charArr.get(m).get(j + secondDiff - 1);
//
//
//                        }
//
//
//
//                    }
//                }
//
//            }
//
//        s++;
//        }
//
//
//        for (int k = 0;k<charArr.size();k++) {
//            s=k;
//            while (s < charArr.size()) {
//
//
//                if (charArr.get(s).size() > expectedCount) {
//                    int diff = charArr.get(s).size() - expectedCount;
//                    int i = 0;
//                    if (i < diff - 1) {
//                        if (charArr.get(s).get(i) < firstIndex)
//                            firstIndex = charArr.get(s).get(i);
//                        if (charArr.get(s).get(i + diff - 1) > lastIndex)
//                            lastIndex = charArr.get(s).get(i + diff - 1);
//
//
//                    }
//
//
//                }
//                s++;
//            }
//        }
//        for (int m = 0; m < exceededCharArr.length; m++) {
//            if (exceededCharArr[m] > 0) {
//                int ex = exceededCharArr[m];
//                int i = 0;
//                int next = (i + ex) - 1;
//                firstIndex = charArr.get(m).get(i);
//                lastIndex = charArr.get(m).get(next);
////                for (int i = 0; i < charArr.get(m).size()-ex-1; i++) {
//                temp = temp + lastIndex - firstIndex;
////                    if (charArr.get(m).get(next) - charArr.get(m).get(i) < min)
////                        min = temp;
//
////                }
//            }
//        }
//
//        return min + 1;
//    }
//
//}
