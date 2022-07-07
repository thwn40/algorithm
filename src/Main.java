import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

class Solution {



    static public String createPhoneNumber(int[] arr) {
        // TODO:
        StringBuffer result = new StringBuffer();
        String temp= Arrays.toString(arr).replaceAll("[^0-9]","");
        if(arr.length==8){
            return result.append("(010)").append(temp.substring(0,4)+"-").append(temp.substring(4)).toString();

        }

        return result.append("("+temp.substring(0,3)+")").append(temp.substring(3,7)+"-")
                .append(temp.substring(7)).toString();
    }



    public static void main(String[] args) {

        System.out.println(createPhoneNumber(new int[]{0,1,0,8, 7, 6, 5, 4, 3, 2, 1}));






        }
    }
