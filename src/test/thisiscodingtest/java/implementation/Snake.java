package test.thisiscodingtest.java.implementation;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

class Node {
    int s;
    String c;

    public Node(int s, String c) {
        this.s = s;
        this.c = c;
    }
}

class Position {
    int x;
    int y;

    public Position(int x, int y) {
        this.x = x;
        this.y = y;
    }
}

public class Snake {
    static int[] dx = {0, 1, 0, -1};
    static int[] dy = {1, 0, -1, 0};
    static int N, L;
    static int[][] board = new int[101][101];
    static ArrayList<Node> info;
    static StringTokenizer st;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        N = Integer.parseInt(br.readLine());
        int K = Integer.parseInt(br.readLine());

        for(int i = 0; i < K; i++) {
            st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            board[a][b] = 1;
        }

        info = new ArrayList<>();
        L = Integer.parseInt(br.readLine());
        for(int i = 0; i < L; i++) {
            st = new StringTokenizer(br.readLine());
            int s = Integer.parseInt(st.nextToken());
            String c = st.nextToken();

            info.add(new Node(s, c));
        }

        System.out.println(simulate());
    }

    static int turn(int direction, String c) {
        if (c.equals("L")) {
            direction = (direction == 0) ? 3 : direction - 1;
        } else {
            direction = (direction + 1) % 4;
        }

        return direction;
    }

    static int simulate() {
        int x = 1, y = 1;
        board[x][y] = 2;
        int time = 0, direction = 0, index = 0;
        Queue<Position> q = new LinkedList<>();
        q.offer(new Position(x, y));

        while(true) {
            int nx = x + dx[direction];
            int ny = y + dy[direction];

            if(1 <= nx && nx <= N && 1 <= ny && ny <= N && board[nx][ny] != 2) {
                if(board[nx][ny] == 0) {
                    board[nx][ny] = 2;
                    q.offer(new Position(nx, ny));
                    Position pos = q.poll();
                    board[pos.x][pos.y] = 0;
                }

                if(board[nx][ny] == 1) {
                    board[nx][ny] = 2;
                    q.offer(new Position(nx, ny));
                }
            } else {
                time++;
                break;
            }

            x = nx;
            y = ny;
            time++;

            if(index < L && time == info.get(index).s) {
                direction = turn(direction, info.get(index).c);
                index++;
            }
        }

        return time;
    }
}