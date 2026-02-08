/*
735. Asteroid Collision
We are given an array asteroids of integers representing asteroids in a row. The indices of the asteroid in the array represent their relative position in space.
For each asteroid, the absolute value represents its size, and the sign represents its direction (positive meaning right, negative meaning left). Each asteroid moves at the same speed.
Find out the state of the asteroids after all collisions. If two asteroids meet, the smaller one will explode. If both are the same size, both will explode. Two asteroids moving in the same direction will never meet. */

class Solution {
    public int[] asteroidCollision(int[] asteroids) {
        Deque<Integer> stack = new ArrayDeque<>();
        for (int a : asteroids) {
            boolean alive = true;
            while (alive && a < 0 && !stack.isEmpty() && stack.peekLast() > 0) {
                int top = stack.peekLast();
                if (top < -a) {
                    stack.pollLast();
                } else if (top == -a) {
                    stack.pollLast();
                    alive = false;
                } else {
                    alive = false;
                }
            }
            if (alive) stack.addLast(a);
        }
        int[] res = new int[stack.size()];
        int i = 0;
        for (int val : stack) res[i++] = val;
        return res;
    }
}
