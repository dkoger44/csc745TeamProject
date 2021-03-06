
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Notorious-V
 */
public class RecipeFrame extends javax.swing.JFrame {

    /**
     * Creates new form RecipeFrame
     */
    public RecipeFrame() {
        initComponents();
        //initialize and display the date
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("MM/dd/yyyy");
	LocalDateTime now = LocalDateTime.now();
        dateTextView.setText(dtf.format(now));
        
        //frame set in center, do not change the size of the screen
        setLocationRelativeTo(null);
        setResizable(false);
	
        //hide search results view until there is an actual set of results to display
        searchResultsPane.setVisible(false);
        //this code will be use to modify what is displayed in the fridge, method needs to be created to generate fridge items
        fridgeListView.setText("Display fridge items, list nutrition facts.");
        //this will display the generated shopping list
        shoppingListView.setText("generate the shopping list here.");
        //this is the recipe list view in the planner tab, have client to check the boxes
        //that they wish to have a recipe to be entered at the checked time period
        recipeSelectionListView.setText("list of recipes to choose from");
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        RecipeSearchText = new javax.swing.JTextField();
        SearchGo = new javax.swing.JButton();
        ManagerSheet = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        fridgeListView = new javax.swing.JTextArea();
        jScrollPane2 = new javax.swing.JScrollPane();
        shoppingListView = new javax.swing.JTextArea();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        DayOfWeekDropMenu = new javax.swing.JComboBox<>();
        jPanel4 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jScrollPane5 = new javax.swing.JScrollPane();
        recipeSelectionListView = new javax.swing.JTextArea();
        jPanel5 = new javax.swing.JPanel();
        breakfastPlannerCheckbox = new javax.swing.JCheckBox();
        lunchPlannerCheckbox = new javax.swing.JCheckBox();
        dinnerPlannerCheckbox = new javax.swing.JCheckBox();
        breakfastPlannerTextView = new javax.swing.JTextField();
        lunchPlannerTextView = new javax.swing.JTextField();
        dinnerPlannerTextView = new javax.swing.JTextField();
        clearPlanner = new javax.swing.JButton();
        moveToList = new javax.swing.JButton();
        moveFromList = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        radioBreakfast = new javax.swing.JRadioButton();
        radioLunch = new javax.swing.JRadioButton();
        radioDinner = new javax.swing.JRadioButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        RecipeInstructionView = new javax.swing.JTextPane();
        jLabel4 = new javax.swing.JLabel();
        RecipeTitleLabel = new javax.swing.JLabel();
        addRecipePanel = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        addRecipeTextField = new javax.swing.JTextField();
        InstructionsLabel = new javax.swing.JLabel();
        jScrollPane6 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        storeRecipe = new javax.swing.JButton();
        searchResultsPane = new javax.swing.JPanel();
        jScrollPane4 = new javax.swing.JScrollPane();
        searchResultsView = new javax.swing.JTextArea();
        dateLabel = new javax.swing.JLabel();
        dateTextView = new javax.swing.JTextField();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        menuItemSave = new javax.swing.JMenuItem();
        menuItemLoad = new javax.swing.JMenuItem();
        menuItemExit = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel1.setText("Search Recipes");
        jLabel1.setToolTipText("");

        RecipeSearchText.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N

        SearchGo.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        SearchGo.setText("Go");
        SearchGo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchActionPerformed(evt);
            }
        });

        fridgeListView.setEditable(false);
        fridgeListView.setColumns(20);
        fridgeListView.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        fridgeListView.setRows(5);
        jScrollPane1.setViewportView(fridgeListView);

        shoppingListView.setColumns(20);
        shoppingListView.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        shoppingListView.setRows(5);
        jScrollPane2.setViewportView(shoppingListView);

        jLabel2.setText("The Fridge");

        jLabel3.setText("The Shopping List");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(251, 251, 251)
                        .addComponent(jLabel3))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 239, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(52, 52, 52)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 242, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(20, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 352, Short.MAX_VALUE)
                    .addComponent(jScrollPane2))
                .addContainerGap(88, Short.MAX_VALUE))
        );

        ManagerSheet.addTab("Fridge", jPanel1);

        DayOfWeekDropMenu.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        DayOfWeekDropMenu.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Monday", "Tuesday", "Wensday", "Thursday", "Friday", "Saturday", "Sunday" }));

        jLabel5.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabel5.setText("Recipe Selection List");
        jLabel5.setToolTipText("");

        recipeSelectionListView.setColumns(20);
        recipeSelectionListView.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        recipeSelectionListView.setRows(5);
        jScrollPane5.setViewportView(recipeSelectionListView);

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(51, 51, 51)
                .addComponent(jLabel5)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 245, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 403, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        breakfastPlannerCheckbox.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        breakfastPlannerCheckbox.setText("Breakfast");
        breakfastPlannerCheckbox.setToolTipText("");

        lunchPlannerCheckbox.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        lunchPlannerCheckbox.setText("Lunch");
        lunchPlannerCheckbox.setToolTipText("");

        dinnerPlannerCheckbox.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        dinnerPlannerCheckbox.setText("Dinner");
        dinnerPlannerCheckbox.setToolTipText("");

        clearPlanner.setText("Clear");

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(breakfastPlannerCheckbox)
                    .addComponent(lunchPlannerCheckbox)
                    .addComponent(dinnerPlannerCheckbox))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(clearPlanner)
                        .addContainerGap(134, Short.MAX_VALUE))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(breakfastPlannerTextView)
                            .addComponent(lunchPlannerTextView)
                            .addComponent(dinnerPlannerTextView))
                        .addGap(10, 10, 10))))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(breakfastPlannerCheckbox)
                    .addComponent(breakfastPlannerTextView, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(87, 87, 87)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lunchPlannerCheckbox)
                    .addComponent(lunchPlannerTextView, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(86, 86, 86)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(dinnerPlannerCheckbox)
                    .addComponent(dinnerPlannerTextView, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(clearPlanner)
                .addContainerGap())
        );

        moveToList.setText("<<");
        moveToList.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                moveToListActionPerformed(evt);
            }
        });

        moveFromList.setText(">>");
        moveFromList.setToolTipText("");
        moveFromList.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                moveFromListActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, 218, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(moveToList)
                .addGap(3, 3, 3)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(moveFromList)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 159, Short.MAX_VALUE)
                        .addComponent(DayOfWeekDropMenu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(21, 21, 21))))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(49, 49, 49)
                        .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, 392, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(DayOfWeekDropMenu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(moveToList)
                            .addComponent(moveFromList))
                        .addGap(18, 18, 18)
                        .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap(30, Short.MAX_VALUE))
        );

        ManagerSheet.addTab("Planner", jPanel2);

        radioBreakfast.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        radioBreakfast.setText("Breakfast");
        radioBreakfast.setToolTipText("");
        radioBreakfast.setActionCommand("radioBreakfast");
        radioBreakfast.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radioBreakfastActionPerformed(evt);
            }
        });

        radioLunch.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        radioLunch.setText("Lunch");
        radioLunch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radioLunchActionPerformed(evt);
            }
        });

        radioDinner.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        radioDinner.setText("Dinner");
        radioDinner.setToolTipText("");
        radioDinner.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radioDinnerActionPerformed(evt);
            }
        });

        jScrollPane3.setViewportView(RecipeInstructionView);

        jLabel4.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel4.setText("Recipe Instructions");
        jLabel4.setToolTipText("");

        RecipeTitleLabel.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        RecipeTitleLabel.setText("Recipe Title");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(radioBreakfast)
                    .addComponent(radioDinner)
                    .addComponent(radioLunch))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 83, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(87, 87, 87)
                        .addComponent(RecipeTitleLabel)
                        .addGap(177, 177, 177))
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                            .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 371, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addContainerGap())
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                            .addComponent(jLabel4)
                            .addGap(132, 132, 132)))))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(RecipeTitleLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 9, Short.MAX_VALUE)
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 383, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(21, 21, 21))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(radioBreakfast)
                        .addGap(74, 74, 74)
                        .addComponent(radioLunch)
                        .addGap(80, 80, 80)
                        .addComponent(radioDinner)
                        .addGap(118, 118, 118))))
        );

        ManagerSheet.addTab("Meal Plan", jPanel3);

        addRecipePanel.setVerifyInputWhenFocusTarget(false);

        jLabel6.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel6.setText("Recipe Name");
        jLabel6.setToolTipText("");

        InstructionsLabel.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        InstructionsLabel.setText("Instructions");
        InstructionsLabel.setToolTipText("");

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane6.setViewportView(jTextArea1);

        storeRecipe.setText("Store");

        javax.swing.GroupLayout addRecipePanelLayout = new javax.swing.GroupLayout(addRecipePanel);
        addRecipePanel.setLayout(addRecipePanelLayout);
        addRecipePanelLayout.setHorizontalGroup(
            addRecipePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, addRecipePanelLayout.createSequentialGroup()
                .addContainerGap(31, Short.MAX_VALUE)
                .addGroup(addRecipePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(storeRecipe)
                    .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 509, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(addRecipeTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 509, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(47, 47, 47))
            .addGroup(addRecipePanelLayout.createSequentialGroup()
                .addGroup(addRecipePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(addRecipePanelLayout.createSequentialGroup()
                        .addGap(219, 219, 219)
                        .addComponent(jLabel6))
                    .addGroup(addRecipePanelLayout.createSequentialGroup()
                        .addGap(222, 222, 222)
                        .addComponent(InstructionsLabel)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        addRecipePanelLayout.setVerticalGroup(
            addRecipePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(addRecipePanelLayout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addComponent(jLabel6)
                .addGap(18, 18, 18)
                .addComponent(addRecipeTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29)
                .addComponent(InstructionsLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 225, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(storeRecipe)
                .addContainerGap(41, Short.MAX_VALUE))
        );

        ManagerSheet.addTab("Add Recipe", addRecipePanel);

        searchResultsView.setEditable(false);
        searchResultsView.setColumns(20);
        searchResultsView.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        searchResultsView.setRows(5);
        jScrollPane4.setViewportView(searchResultsView);

        javax.swing.GroupLayout searchResultsPaneLayout = new javax.swing.GroupLayout(searchResultsPane);
        searchResultsPane.setLayout(searchResultsPaneLayout);
        searchResultsPaneLayout.setHorizontalGroup(
            searchResultsPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane4)
        );
        searchResultsPaneLayout.setVerticalGroup(
            searchResultsPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 125, Short.MAX_VALUE)
        );

        dateLabel.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        dateLabel.setText("Today:");
        dateLabel.setToolTipText("");

        dateTextView.setEditable(false);
        dateTextView.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        dateTextView.setToolTipText("");

        jMenu1.setText("File");

        menuItemSave.setText("Save");
        menuItemSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuItemSaveActionPerformed(evt);
            }
        });
        jMenu1.add(menuItemSave);

        menuItemLoad.setText("Load");
        menuItemLoad.setToolTipText("");
        menuItemLoad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuItemLoadActionPerformed(evt);
            }
        });
        jMenu1.add(menuItemLoad);

        menuItemExit.setText("Exit");
        menuItemExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuItemExitActionPerformed(evt);
            }
        });
        jMenu1.add(menuItemExit);

        jMenuBar1.add(jMenu1);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(ManagerSheet, javax.swing.GroupLayout.PREFERRED_SIZE, 592, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(89, 325, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(searchResultsPane, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(RecipeSearchText, javax.swing.GroupLayout.DEFAULT_SIZE, 353, Short.MAX_VALUE)
                                        .addGap(2, 2, 2))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addGap(0, 0, Short.MAX_VALUE)
                                        .addComponent(dateLabel)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(SearchGo)
                                    .addComponent(dateTextView, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addContainerGap())))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(dateLabel)
                    .addComponent(dateTextView, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(12, 12, 12)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(ManagerSheet, javax.swing.GroupLayout.PREFERRED_SIZE, 499, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(SearchGo, javax.swing.GroupLayout.DEFAULT_SIZE, 31, Short.MAX_VALUE)
                            .addComponent(RecipeSearchText))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(searchResultsPane, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(33, Short.MAX_VALUE))
        );

        ManagerSheet.getAccessibleContext().setAccessibleName("Fridge");

        pack();
    }// </editor-fold>//GEN-END:initComponents
    //search button listener
    private void searchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_searchActionPerformed
   
    private void radioBreakfastActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radioBreakfastActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_radioBreakfastActionPerformed

    private void radioLunchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radioLunchActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_radioLunchActionPerformed

    private void radioDinnerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radioDinnerActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_radioDinnerActionPerformed

    private void menuItemSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuItemSaveActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_menuItemSaveActionPerformed

    private void menuItemLoadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuItemLoadActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_menuItemLoadActionPerformed

    private void menuItemExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuItemExitActionPerformed
        // exit the program when selected
        System.exit(0);
    }//GEN-LAST:event_menuItemExitActionPerformed

    private void moveToListActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_moveToListActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_moveToListActionPerformed

    private void moveFromListActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_moveFromListActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_moveFromListActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(RecipeFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(RecipeFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(RecipeFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(RecipeFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new RecipeFrame().setVisible(true);
              
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> DayOfWeekDropMenu;
    private javax.swing.JLabel InstructionsLabel;
    private javax.swing.JTabbedPane ManagerSheet;
    private javax.swing.JTextPane RecipeInstructionView;
    private javax.swing.JTextField RecipeSearchText;
    private javax.swing.JLabel RecipeTitleLabel;
    private javax.swing.JButton SearchGo;
    private javax.swing.JPanel addRecipePanel;
    private javax.swing.JTextField addRecipeTextField;
    private javax.swing.JCheckBox breakfastPlannerCheckbox;
    private javax.swing.JTextField breakfastPlannerTextView;
    private javax.swing.JButton clearPlanner;
    private javax.swing.JLabel dateLabel;
    private javax.swing.JTextField dateTextView;
    private javax.swing.JCheckBox dinnerPlannerCheckbox;
    private javax.swing.JTextField dinnerPlannerTextView;
    private javax.swing.JTextArea fridgeListView;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JCheckBox lunchPlannerCheckbox;
    private javax.swing.JTextField lunchPlannerTextView;
    private javax.swing.JMenuItem menuItemExit;
    private javax.swing.JMenuItem menuItemLoad;
    private javax.swing.JMenuItem menuItemSave;
    private javax.swing.JButton moveFromList;
    private javax.swing.JButton moveToList;
    private javax.swing.JRadioButton radioBreakfast;
    private javax.swing.JRadioButton radioDinner;
    private javax.swing.JRadioButton radioLunch;
    private javax.swing.JTextArea recipeSelectionListView;
    private javax.swing.JPanel searchResultsPane;
    private javax.swing.JTextArea searchResultsView;
    private javax.swing.JTextArea shoppingListView;
    private javax.swing.JButton storeRecipe;
    // End of variables declaration//GEN-END:variables
}
