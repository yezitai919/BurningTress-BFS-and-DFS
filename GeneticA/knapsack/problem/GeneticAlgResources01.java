package knapsack.problem;

/**遗传算法的资源类对象
 * @author 矜君
 * @date 2020/9/29 7:45.
 */
public class GeneticAlgResources01 {
    //求解问题的资源：
    /**
     * 物品数量
     */
    public int goodNum;
    /**
     * 背包容量(隐约束)
     */
    public int capacity;
    /**
     * 各个物品的重量
     */
    public int[] weight;
    /**
     * 各个物品的价值
     */
    public int[] value;

    //遗传算法的标配资源：
    /**
     * 染色体的基因数
     */
    public int gene;
    /**
     * 种群的个体数
     */
    public int populationNum;
    /**
     * 种群的染色体的基因序列
     */
    public int[][] chromosome;
    /**
     * 种群适应度
     */
    public int[] adaptiveness;
    /**
     * 种群适应度总和
     */
    public int adaptivenessSum;
    /**
     * 总的演化代数
     */
    public int generationNum;
    /**
     * 生存者编号(有重复，足够优秀的个体可能被选中多次，这意味着它可以有多个孩子)
     */
    public int[] parent;
    /**
     * 交叉概率
     */
    public double crossoverRate;
    /**
     * 变异概率
     */
    public double mutationRate;
    /**
     * 临时记录下一代的染色体
     */
    public int[][] childChromosome;
    /**
     * 最优染色体的适应度(在本题最优适应度=最优值)
     */
    public int optimalValue = 0;
    /**
     * 最优染色体的基因序列(最优解)
     */
    public int[] optimalSolution;

    /** 构造方法，只需要传入与问题相关的变量和遗传算法的四个主要影响变量
     * @param goodNum 物品数量
     * @param capacity 背包容量
     * @param weight 物品重量
     * @param value 物品价值
     * @param populationNum 种群数量
     * @param generationNum 遗传代数
     * @param crossoverRate 交叉率
     * @param mutationRate 变异率
     */
    public GeneticAlgResources01(int goodNum, int capacity, int[] weight, int[] value,
                                 int populationNum, int generationNum, double crossoverRate, double mutationRate) {
        this.goodNum = goodNum;
        this.capacity = capacity;
        this.weight = weight;
        this.value = value;
        this.populationNum = populationNum;
        this.generationNum = generationNum;
        this.crossoverRate = crossoverRate;
        this.mutationRate = mutationRate;
    }


}
