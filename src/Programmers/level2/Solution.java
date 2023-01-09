package Programmers.level2;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/**
 * [["100","ryan","music","2"]
 * ,["200","apeach","math","2"]
 * ,["300","tube","computer","3"]
 * ,["400","con","computer","4"]
 * ,["500","muzi","music","3"]
 * ,["600","apeach","music","2"]]
 */
class Solution {
	public int solution(String[][] relation) {
		int answer = 0;

		int rowSize = relation.length;
		int columnSize = relation[0].length;

		Map<Integer, Set<Object>> map = new HashMap<>();
		for (int i = 0; i < relation[0].length; i++) {
			map.put(i, new HashSet<>());
		}

		for (int i = 0; i < relation.length; i++) {
			for (int j = 0; j < relation[i].length; j++) {
				map.get(j).add(relation[i][j]);
			}
		}

		System.out.println(map);

		for (int i = 0; i < columnSize; i++) {
			if(rowSize==map.get(i).size()){
				answer++;
			}
		}

		int[] arr = {1, 2, 3}; //조합을 만들 배열
		boolean[] visited = new boolean[arr.length]; //조합에 뽑혔는지를 확인하기 위한 배열

		//1. 백트래킹을 이용해 구현
		for(int r = 1; r <= arr.length ; r++) {;
			comb2(arr, visited, 0, r);
		}

		System.out.println(answer);
		return answer;
	}

	void comb2(int[] arr, boolean[] visited, int depth, int r) {
		if(r == 0) {
			print(arr, visited);
			return;
		}
		if(depth == arr.length) {
			return;
		} else {
			visited[depth] = true;
			comb2(arr, visited, depth + 1, r - 1);

			visited[depth] = false;
			comb2(arr, visited, depth + 1, r);
		}
	}

	void print(int[] arr, boolean[] visited) {
		for(int i = 0; i < arr.length; i++) {
			if(visited[i]){
				System.out.print(arr[i] + " ");
			}
		}

	}

	public static void main(String[] args) {
		Solution solution = new Solution();
		solution.solution(new String[][] {{"100", "ryan", "music", "2"}, {"200", "apeach", "math", "2"},
			{"300", "tube", "computer", "3"}, {"400", "con", "computer", "4"}, {"500", "muzi", "music", "3"},
			{"600", "apeach", "music", "2"}});
	}
}
