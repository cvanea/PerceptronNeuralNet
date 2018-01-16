import java.util.ArrayList;
import java.util.Random;

class BinaryDecisionNeuralNet {

    private ArrayList<Integer> desiredOutcome;
    private ArrayList<Integer[]> patterns;
    private ArrayList<Double> weights = new ArrayList<>();
    private ArrayList<Integer> actualOutcome;
    private Double learningRate = 0.1;
    private Double error;
    private int epoch = 0;
    private int maxEpoch = 50;

    BinaryDecisionNeuralNet(ArrayList<Integer> desiredOutcome, ArrayList<Integer[]> patterns) {
        this.desiredOutcome = desiredOutcome;
        this.patterns = patterns;
        this.actualOutcome = new ArrayList<>();

        generateWeights();
    }

    void learn() {
        while (!isSolved() && epoch < maxEpoch) {
            epoch++;
            error = 0.0;

            System.out.println("The current weights are: " + weights);

            for (int p = 0; p < patterns.size(); p++) {
                calculateOutcome(patterns.get(p), p);
                errorFunction(p);
                adjustWeights(patterns.get(p), p);
            }

            System.out.println("The current outcome is: " + actualOutcome);
            System.out.println("The desired outcome is: " + desiredOutcome);
            System.out.println("Epoch number is: " + epoch);
            System.out.println("The error for this epoch is: " + error);
            System.out.println();
        }
    }

    private boolean isSolved() {
        return desiredOutcome.equals(actualOutcome);
    }

    private void calculateOutcome(Integer[] pattern, int p) {
        Double activation = 0.0;
        for (int j = 0; j < weights.size(); j++) {
            activation += (weights.get(j) * pattern[j]);
        }
        if (actualOutcome.size() < patterns.size()) {
            actualOutcome.add(p, stepFunction(activation));
        } else actualOutcome.set(p, stepFunction(activation));
    }

    private Integer stepFunction(Double activation) {
        if (activation > 0) {
            return 1;
        } else return 0;
    }

    private void adjustWeights(Integer[] pattern, int p) {
        for (int j = 0; j < weights.size(); j++) {
            Double newWeight = weights.get(j) + (learningRate * (desiredOutcome.get(p) - actualOutcome.get(p)) * pattern[j]);
            weights.set(j, newWeight);
        }
    }

    private void errorFunction(int p) {
        error += (1 / (double) patterns.size()) * (desiredOutcome.get(p) - actualOutcome.get(p)) * (desiredOutcome.get(p) - actualOutcome.get(p));
    }

    private void generateWeights() {
        Random random = new Random();
        for (int j = 0; j < patterns.get(0).length; j++) {
            Double weight = random.nextDouble() * (0.1 - -0.1) + -0.1;
            this.weights.add(weight);
        }
    }
}
