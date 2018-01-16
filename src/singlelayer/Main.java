package singlelayer;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

//        firstInputTrue();
        majority();
//        booleanAnd();
//        booleanOr();
    }

    private static void firstInputTrue() {
        //When A is true, the whole input is true.
        ArrayList<Integer[]> patterns = new ArrayList<>();
        Integer[] pattern1 = {1, 1, 1, 1};
        Integer[] pattern2 = {1, 1, 1, 0};
        Integer[] pattern3 = {1, 1, 0, 0};
        Integer[] pattern4 = {1, 0, 1, 1};
        Integer[] pattern5 = {1, 0, 0, 1};
        Integer[] pattern6 = {1, 0, 1, 0};
        Integer[] pattern7 = {1, 1, 0, 1};
        patterns.add(pattern1);
        patterns.add(pattern2);
        patterns.add(pattern3);
        patterns.add(pattern4);
        patterns.add(pattern5);
        patterns.add(pattern6);
        patterns.add(pattern7);

        ArrayList<Integer> desiredOutcomes1 = new ArrayList<>();
        desiredOutcomes1.add(1);
        desiredOutcomes1.add(1);
        desiredOutcomes1.add(1);
        desiredOutcomes1.add(0);
        desiredOutcomes1.add(0);
        desiredOutcomes1.add(0);
        desiredOutcomes1.add(1);

        BinaryDecisionNeuralNet neuron = new BinaryDecisionNeuralNet(desiredOutcomes1, patterns);

        neuron.learn();
    }

    private static void majority() {
        //True when the majority is true
        ArrayList<Integer[]> patterns = new ArrayList<>();
        Integer[] pattern1 = {1, 1, 1, 1};
        Integer[] pattern2 = {1, 1, 1, 0};
        Integer[] pattern3 = {1, 1, 0, 0};
        Integer[] pattern4 = {1, 0, 1, 1};
        Integer[] pattern5 = {1, 0, 0, 1};
        Integer[] pattern6 = {1, 0, 1, 0};
        Integer[] pattern7 = {1, 1, 0, 1};
        patterns.add(pattern1);
        patterns.add(pattern2);
        patterns.add(pattern3);
        patterns.add(pattern4);
        patterns.add(pattern5);
        patterns.add(pattern6);
        patterns.add(pattern7);

        ArrayList<Integer> desiredOutcomes1 = new ArrayList<>();
        desiredOutcomes1.add(1);
        desiredOutcomes1.add(1);
        desiredOutcomes1.add(0);
        desiredOutcomes1.add(1);
        desiredOutcomes1.add(0);
        desiredOutcomes1.add(0);
        desiredOutcomes1.add(1);

        BinaryDecisionNeuralNet neuron = new BinaryDecisionNeuralNet(desiredOutcomes1, patterns);

        neuron.learn();
    }

    private static void booleanAnd() {
        //True only when both are true
        ArrayList<Integer[]> patterns = new ArrayList<>();
        Integer[] pattern1 = {1, 1, 1};
        Integer[] pattern2 = {1, 1, 0};
        Integer[] pattern3 = {1, 0, 1};
        Integer[] pattern4 = {1, 0, 0};
        patterns.add(pattern1);
        patterns.add(pattern2);
        patterns.add(pattern3);
        patterns.add(pattern4);

        ArrayList<Integer> desiredOutcomes1 = new ArrayList<>();
        desiredOutcomes1.add(1);
        desiredOutcomes1.add(0);
        desiredOutcomes1.add(0);
        desiredOutcomes1.add(0);

        BinaryDecisionNeuralNet neuron = new BinaryDecisionNeuralNet(desiredOutcomes1, patterns);

        neuron.learn();
    }

    private static void booleanOr() {
        //True when either is true
        ArrayList<Integer[]> patterns = new ArrayList<>();
        Integer[] pattern1 = {1, 1, 1};
        Integer[] pattern2 = {1, 1, 0};
        Integer[] pattern3 = {1, 0, 1};
        Integer[] pattern4 = {1, 0, 0};
        patterns.add(pattern1);
        patterns.add(pattern2);
        patterns.add(pattern3);
        patterns.add(pattern4);

        ArrayList<Integer> desiredOutcomes1 = new ArrayList<>();
        desiredOutcomes1.add(1);
        desiredOutcomes1.add(1);
        desiredOutcomes1.add(1);
        desiredOutcomes1.add(0);

        BinaryDecisionNeuralNet neuron = new BinaryDecisionNeuralNet(desiredOutcomes1, patterns);

        neuron.learn();
    }

}
