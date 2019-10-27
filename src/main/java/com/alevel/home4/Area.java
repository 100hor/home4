package com.alevel.home4;

public class Area {
    public int maxArea(int[] height) {
        int max = 0;
        for (int i = 0; i < height.length - 1; i++) {
            for (int j = i + 1; j < height.length; j++) {
                if (height[i] >= height[j]) {
                    if (height[j] * Math.abs(i - j) > max) {
                        max = height[j] * Math.abs(i - j);
                    } else if (height[i] < height[j]) {
                        if (height[i] * Math.abs(i - j) > max) {
                            max = height[i] * Math.abs(i - j);
                        }
                    }
                }
            }
        }
        return max;

    }
}
