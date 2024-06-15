
import fi.helsinki.cs.tmc.edutestutils.MockStdio;
import fi.helsinki.cs.tmc.edutestutils.Points;
import java.io.IOException;
import org.junit.*;
import static org.junit.Assert.*;

@Points("10-13.1 10-13.2")
public class LiteracyComparisonHiddenTest {

    String expected = "Niger (2015), female, 11.01572\n"
            + "Mali (2015), female, 22.19578\n"
            + "Guinea (2015), female, 22.87104\n"
            + "Afghanistan (2015), female, 23.87385\n"
            + "Central African Republic (2015), female, 24.35549\n"
            + "South Sudan (2015), female, 25.39306\n"
            + "Burkina Faso (2014), female, 26.22028\n"
            + "Niger (2015), male, 27.28036\n"
            + "Benin (2015), female, 27.28826\n"
            + "Burkina Faso (2015), female, 28.34884\n"
            + "Chad (2014), female, 30.35325\n"
            + "Chad (2015), female, 31.7543\n"
            + "Côte d'Ivoire (2015), female, 32.72971\n"
            + "Liberia (2015), female, 32.81483\n"
            + "Sierra Leone (2014), female, 36.79042\n"
            + "Guinea (2015), male, 38.09076\n"
            + "Sierra Leone (2015), female, 38.18145\n"
            + "South Sudan (2015), male, 38.64849\n"
            + "Ethiopia (2015), female, 40.96794\n"
            + "Mauritania (2015), female, 41.61153\n"
            + "Pakistan (2015), female, 42.72717\n"
            + "Senegal (2015), female, 43.80036\n"
            + "Burkina Faso (2014), male, 44.37944\n"
            + "Mali (2015), male, 45.06591\n"
            + "Mozambique (2015), female, 45.52547\n"
            + "Gambia (2014), female, 46.13246\n"
            + "Guinea-Bissau (2014), female, 46.701\n"
            + "Burkina Faso (2015), male, 47.5735\n"
            + "Gambia (2015), female, 47.64489\n"
            + "Chad (2014), male, 47.85004\n"
            + "Guinea-Bissau (2015), female, 48.13656\n"
            + "Chad (2015), male, 48.37528\n"
            + "Nigeria (2015), female, 49.6802\n"
            + "Benin (2015), male, 49.87284\n"
            + "Central African Republic (2015), male, 50.71271\n"
            + "Afghanistan (2015), male, 51.47268\n"
            + "Sudan (2015), female, 53.12355\n"
            + "Côte d'Ivoire (2015), male, 53.28325\n"
            + "Yemen (2014), female, 53.29516\n"
            + "Nepal (2015), female, 54.75052\n"
            + "Yemen (2015), female, 54.85063\n"
            + "Bhutan (2015), female, 55.11819\n"
            + "Togo (2015), female, 55.30268\n"
            + "Haiti (2015), female, 57.17099\n"
            + "Bangladesh (2014), female, 57.17255\n"
            + "Ethiopia (2015), male, 57.27806\n"
            + "Sierra Leone (2014), male, 57.94999\n"
            + "Bangladesh (2015), female, 58.31364\n"
            + "Malawi (2015), female, 59.03111\n"
            + "Sierra Leone (2015), male, 59.03774\n"
            + "Timor-Leste (2015), female, 59.50658\n"
            + "Angola (2014), female, 60.24049\n"
            + "Angola (2015), female, 60.7448\n"
            + "Papua New Guinea (2014), female, 61.0123\n"
            + "Papua New Guinea (2015), female, 61.77299\n"
            + "Morocco (2015), female, 62.04612\n"
            + "Liberia (2015), male, 62.42057\n"
            + "Madagascar (2015), female, 62.61379\n"
            + "Mauritania (2015), male, 62.62729\n"
            + "India (2015), female, 62.98472\n"
            + "Gambia (2014), male, 63.08793\n"
            + "Gambia (2015), male, 63.92988\n"
            + "Bangladesh (2014), male, 63.94329\n"
            + "Sudan (2015), male, 64.12222\n"
            + "Eritrea (2014), female, 64.25323\n"
            + "Haiti (2015), male, 64.38914\n"
            + "Bangladesh (2015), male, 64.64259\n"
            + "Papua New Guinea (2015), male, 65.06011\n"
            + "Papua New Guinea (2014), male, 65.13778\n"
            + "Eritrea (2015), female, 65.60877\n"
            + "Democratic Republic of the Congo (2015), female, 65.89735\n"
            + "Madagascar (2015), male, 66.74227\n"
            + "Uganda (2015), female, 66.7848\n"
            + "Egypt (2015), female, 68.05779\n"
            + "Rwanda (2015), female, 68.26932\n"
            + "Senegal (2015), male, 68.47262\n"
            + "Timor-Leste (2015), male, 68.52424\n"
            + "Cameroon (2015), female, 68.88101\n"
            + "Nigeria (2015), male, 69.18883\n"
            + "Pakistan (2015), male, 69.57022\n"
            + "Lesotho (2015), male, 70.06676\n"
            + "Guinea-Bissau (2014), male, 71.05703\n"
            + "Bhutan (2015), male, 71.14718\n"
            + "Ghana (2015), female, 71.35002\n"
            + "Guinea-Bissau (2015), male, 71.6952\n"
            + "Cambodia (2015), female, 72.29684\n"
            + "Tunisia (2015), female, 72.80232\n"
            + "Lao People's Democratic Republic (2015), female, 72.82442\n"
            + "Congo (2015), female, 72.87706\n"
            + "Malawi (2015), male, 73.01812\n"
            + "Algeria (2015), female, 73.05513\n"
            + "Iraq (2014), female, 73.34736\n"
            + "Mozambique (2015), male, 73.42743\n"
            + "Comoros (2014), female, 73.4575\n"
            + "Iraq (2015), female, 73.83076\n"
            + "Guatemala (2015), female, 73.91977\n"
            + "Comoros (2015), female, 74.2552\n"
            + "Rwanda (2015), male, 74.67559\n"
            + "Kenya (2015), female, 74.96984\n"
            + "Nepal (2015), male, 75.80978\n"
            + "United Republic of Tanzania (2015), female, 76.08978\n"
            + "Guatemala (2014), female, 76.37066\n"
            + "Togo (2015), male, 78.29314\n"
            + "Syrian Arab Republic (2014), female, 80.27185\n"
            + "Zambia (2015), female, 80.56697\n"
            + "Syrian Arab Republic (2015), female, 80.72494\n"
            + "India (2015), male, 80.93555\n"
            + "Uganda (2015), male, 80.95406\n"
            + "Gabon (2015), female, 81.11021\n"
            + "Kenya (2015), male, 81.11037\n"
            + "Cameroon (2015), male, 81.15286\n"
            + "Eritrea (2014), male, 81.55879\n"
            + "Comoros (2014), male, 81.66863\n"
            + "Morocco (2015), male, 81.88314\n"
            + "Angola (2015), male, 81.96902\n"
            + "Comoros (2015), male, 81.99892\n"
            + "Ghana (2015), male, 82.03471\n"
            + "Angola (2014), male, 82.15105\n"
            + "Belize (2015), male, 82.22854\n"
            + "Nicaragua (2015), male, 82.28678\n"
            + "Eritrea (2015), male, 82.29334\n"
            + "Nicaragua (2015), female, 82.64549\n"
            + "Burundi (2015), female, 82.91289\n"
            + "Vanuatu (2014), female, 83.09274\n"
            + "Iran (Islamic Republic of) (2015), female, 83.18189\n"
            + "Belize (2015), female, 83.31382\n"
            + "Jamaica (2014), male, 83.4367\n"
            + "Egypt (2015), male, 83.61366\n"
            + "Vanuatu (2015), female, 83.67618\n"
            + "Jamaica (2015), male, 83.87987\n"
            + "Yemen (2014), male, 84.17932\n"
            + "Cabo Verde (2015), female, 84.65951\n"
            + "Guatemala (2015), male, 84.71202\n"
            + "United Republic of Tanzania (2015), male, 84.76193\n"
            + "Cambodia (2015), male, 84.95444\n"
            + "Yemen (2015), male, 84.97328\n"
            + "Libya (2014), female, 85.2696\n"
            + "Zimbabwe (2015), female, 85.28513\n"
            + "Gabon (2015), male, 85.31377\n"
            + "Iraq (2015), male, 85.59872\n"
            + "El Salvador (2015), female, 85.60792\n"
            + "Iraq (2014), male, 85.68181\n"
            + "Libya (2015), female, 85.81129\n"
            + "Guyana (2015), male, 85.84388\n"
            + "Vanuatu (2014), male, 85.93844\n"
            + "Algeria (2015), male, 86.13082\n"
            + "Congo (2015), male, 86.43431\n"
            + "Vanuatu (2015), male, 86.45132\n"
            + "Botswana (2014), male, 86.73638\n"
            + "Guatemala (2014), male, 86.75616\n"
            + "Honduras (2014), female, 87.02599\n"
            + "Lao People's Democratic Republic (2015), male, 87.16499\n"
            + "Botswana (2015), male, 87.22461\n"
            + "Honduras (2014), male, 87.39595\n"
            + "Swaziland (2015), male, 87.44112\n"
            + "Swaziland (2015), female, 87.49804\n"
            + "Sao Tome and Principe (2015), female, 87.96029\n"
            + "Burundi (2015), male, 88.19146\n"
            + "Lesotho (2015), female, 88.2875\n"
            + "Honduras (2015), male, 88.32135\n"
            + "Mauritius (2015), female, 88.45312\n"
            + "Honduras (2015), female, 88.52594\n"
            + "Zimbabwe (2015), male, 88.54822\n"
            + "Botswana (2014), female, 88.66818\n"
            + "Democratic Republic of the Congo (2015), male, 88.81258\n"
            + "Oman (2014), female, 88.9267\n"
            + "Botswana (2015), female, 89.21347\n"
            + "Guyana (2015), female, 89.23514\n"
            + "Oman (2015), female, 89.66205\n"
            + "Tunisia (2015), male, 89.6815\n"
            + "Zambia (2015), male, 89.74845\n"
            + "El Salvador (2015), male, 90.10247\n"
            + "Mauritius (2014), female, 90.28332\n"
            + "Peru (2014), female, 90.44918\n"
            + "Namibia (2015), female, 90.64672\n"
            + "Myanmar (2014), female, 90.89014\n"
            + "Namibia (2015), male, 91.01056\n"
            + "Iran (Islamic Republic of) (2015), male, 91.14131\n"
            + "Myanmar (2015), female, 91.15045\n"
            + "Dominican Republic (2014), male, 91.37165\n"
            + "Syrian Arab Republic (2014), male, 91.49841\n"
            + "Peru (2015), female, 91.54063\n"
            + "Sri Lanka (2015), female, 91.70865\n"
            + "Syrian Arab Republic (2015), male, 91.82498\n"
            + "Saudi Arabia (2015), female, 91.84068\n"
            + "Dominican Republic (2015), male, 91.95029\n"
            + "Lebanon (2015), female, 92.03942\n"
            + "Réunion (2014), male, 92.12848\n"
            + "Dominican Republic (2014), female, 92.14776\n"
            + "Brazil (2015), male, 92.29194\n"
            + "United Arab Emirates (2015), male, 92.35662\n"
            + "Réunion (2015), male, 92.39162\n"
            + "Turkey (2014), female, 92.40182\n"
            + "Equatorial Guinea (2014), female, 92.44524\n"
            + "Cabo Verde (2015), male, 92.4603\n"
            + "Malta (2015), male, 92.52534\n"
            + "Thailand (2015), female, 92.59844\n"
            + "Jamaica (2014), female, 92.71197\n"
            + "Puerto Rico (2015), male, 92.79125\n"
            + "Viet Nam (2015), female, 92.84366\n"
            + "Brazil (2015), female, 92.86592\n"
            + "Mauritius (2015), male, 92.86595\n"
            + "Bolivia (Plurinational State of) (2015), female, 92.87606\n"
            + "Equatorial Guinea (2015), female, 92.88651\n"
            + "Turkey (2015), female, 92.90122\n"
            + "Dominican Republic (2015), female, 92.96755\n"
            + "Jamaica (2015), female, 93.0106\n"
            + "South Africa (2014), female, 93.07306\n"
            + "Malaysia (2015), female, 93.10647\n"
            + "Ecuador (2014), female, 93.25386\n"
            + "South Africa (2015), female, 93.42893\n"
            + "Bahrain (2015), female, 93.43386\n"
            + "Indonesia (2014), female, 93.4509\n"
            + "Mexico (2015), female, 93.51342\n"
            + "Mexico (2014), female, 93.59134\n"
            + "Ecuador (2015), female, 93.59759\n"
            + "Sri Lanka (2015), male, 93.61667\n"
            + "Greece (2015), female, 93.65439\n"
            + "Paraguay (2014), female, 93.73455\n"
            + "Réunion (2014), female, 93.80293\n"
            + "Puerto Rico (2015), female, 93.81005\n"
            + "Indonesia (2015), female, 93.81724\n"
            + "Colombia (2014), male, 93.86164\n"
            + "Réunion (2015), female, 94.01886\n"
            + "Portugal (2015), female, 94.13274\n"
            + "Palestine (2014), female, 94.4073\n"
            + "Panama (2015), female, 94.42171\n"
            + "China (2015), female, 94.47139\n"
            + "Colombia (2015), male, 94.47749\n"
            + "Colombia (2014), female, 94.48466\n"
            + "Colombia (2015), female, 94.6714\n"
            + "Mauritius (2014), male, 94.76538\n"
            + "Seychelles (2015), male, 94.80518\n"
            + "Palestine (2015), female, 94.80767\n"
            + "Singapore (2014), female, 94.91132\n"
            + "Paraguay (2015), female, 94.95808\n"
            + "Suriname (2015), female, 94.96795\n"
            + "Singapore (2015), female, 94.98402\n"
            + "Oman (2014), male, 94.99074\n"
            + "United Arab Emirates (2015), female, 95.07634\n"
            + "Venezuela (Bolivarian Republic of) (2015), male, 95.08134\n"
            + "Myanmar (2014), male, 95.10142\n"
            + "Myanmar (2015), male, 95.16604\n"
            + "Kuwait (2015), female, 95.23039\n"
            + "Ecuador (2014), male, 95.25717\n"
            + "South Africa (2014), male, 95.28685\n"
            + "Thailand (2015), male, 95.43159\n"
            + "Brunei Darussalam (2015), female, 95.44203\n"
            + "Ecuador (2015), male, 95.45015\n"
            + "Paraguay (2014), male, 95.54606\n"
            + "Malta (2015), female, 95.59015\n"
            + "Mexico (2015), male, 95.60925\n"
            + "Mexico (2014), male, 95.62047\n"
            + "Sao Tome and Principe (2015), male, 95.63748\n"
            + "Panama (2015), male, 95.65964\n"
            + "Venezuela (Bolivarian Republic of) (2015), female, 95.70818\n"
            + "Oman (2015), male, 95.78784\n"
            + "South Africa (2015), male, 95.83281\n"
            + "Seychelles (2015), female, 95.84785\n"
            + "Guadeloupe (2014), male, 96.00619\n"
            + "Lebanon (2015), male, 96.03509\n"
            + "Paraguay (2015), male, 96.09921\n"
            + "Suriname (2015), male, 96.11791\n"
            + "Guadeloupe (2015), male, 96.16104\n"
            + "Malaysia (2015), male, 96.19606\n"
            + "Philippines (2015), male, 96.2025\n"
            + "Martinique (2014), female, 96.20655\n"
            + "Viet Nam (2015), male, 96.27764\n"
            + "Martinique (2015), female, 96.2975\n"
            + "Guadeloupe (2014), female, 96.37906\n"
            + "New Caledonia (2014), female, 96.38996\n"
            + "Chile (2015), female, 96.50222\n"
            + "Guadeloupe (2015), female, 96.50342\n"
            + "New Caledonia (2015), female, 96.5336\n"
            + "Greece (2014), female, 96.66508\n"
            + "The former Yugoslav Republic of Macedonia (2014), female, 96.71257\n"
            + "Chile (2015), male, 96.75828\n"
            + "Albania (2015), female, 96.76969\n"
            + "Kuwait (2015), male, 96.77174\n"
            + "Indonesia (2014), male, 96.79101\n"
            + "Libya (2014), male, 96.79474\n"
            + "The former Yugoslav Republic of Macedonia (2015), female, 96.87073\n"
            + "Portugal (2015), male, 96.90553\n"
            + "Peru (2014), male, 96.94898\n"
            + "Saudi Arabia (2015), male, 96.94951\n"
            + "Bahrain (2015), male, 96.94984\n"
            + "Serbia (2015), female, 96.99178\n"
            + "Libya (2015), male, 96.99825\n"
            + "Philippines (2015), female, 97.03275\n"
            + "Greece (2015), male, 97.04235\n"
            + "Indonesia (2015), male, 97.05916\n"
            + "New Caledonia (2014), male, 97.2192\n"
            + "Bosnia and Herzegovina (2014), female, 97.23599\n"
            + "Martinique (2014), male, 97.25424\n"
            + "Peru (2015), male, 97.26257\n"
            + "Equatorial Guinea (2014), male, 97.29047\n"
            + "Martinique (2015), male, 97.29079\n"
            + "New Caledonia (2015), male, 97.33907\n"
            + "Equatorial Guinea (2015), male, 97.34365\n"
            + "Bosnia and Herzegovina (2015), female, 97.42954\n"
            + "Bolivia (Plurinational State of) (2015), male, 97.43713\n"
            + "Spain (2014), female, 97.48787\n"
            + "Jordan (2015), female, 97.49071\n"
            + "Spain (2015), female, 97.49696\n"
            + "Qatar (2015), female, 97.51201\n"
            + "Aruba (2015), female, 97.51396\n"
            + "Aruba (2015), male, 97.53584\n"
            + "Qatar (2014), female, 97.55827\n"
            + "Costa Rica (2015), male, 97.58352\n"
            + "Costa Rica (2015), female, 97.71025\n"
            + "Qatar (2014), male, 97.7937\n"
            + "Brunei Darussalam (2015), male, 97.79807\n"
            + "Qatar (2015), male, 97.83316\n"
            + "Argentina (2014), male, 97.98935\n"
            + "Montenegro (2015), female, 98.02364\n"
            + "Uruguay (2014), male, 98.02507\n"
            + "Argentina (2015), male, 98.04198\n"
            + "Uruguay (2015), male, 98.04225\n"
            + "Bulgaria (2015), female, 98.06881\n"
            + "Argentina (2014), female, 98.07569\n"
            + "Argentina (2015), female, 98.13478\n"
            + "China (2015), male, 98.16471\n"
            + "Mongolia (2015), male, 98.17666\n"
            + "Marshall Islands (2015), female, 98.20298\n"
            + "Marshall Islands (2015), male, 98.32509\n"
            + "Albania (2015), male, 98.36764\n"
            + "Antigua and Barbuda (2014), male, 98.4\n"
            + "Palestine (2014), male, 98.40238\n"
            + "Romania (2015), female, 98.45471\n"
            + "Greece (2014), male, 98.45602\n"
            + "Palestine (2015), male, 98.49467\n"
            + "Turkey (2014), male, 98.49679\n"
            + "Jordan (2015), male, 98.51077\n"
            + "Mongolia (2015), female, 98.55176\n"
            + "Singapore (2014), male, 98.60895\n"
            + "Trinidad and Tobago (2014), female, 98.62493\n"
            + "Singapore (2015), male, 98.63719\n"
            + "Cyprus (2015), female, 98.6428\n"
            + "Turkey (2015), male, 98.64673\n"
            + "Trinidad and Tobago (2015), female, 98.70233\n"
            + "Spain (2014), male, 98.73126\n"
            + "Bulgaria (2015), male, 98.73335\n"
            + "Spain (2015), male, 98.76702\n"
            + "Italy (2015), female, 98.79158\n"
            + "Uruguay (2015), female, 98.80391\n"
            + "Uruguay (2014), female, 98.80905\n"
            + "The former Yugoslav Republic of Macedonia (2014), male, 98.81255\n"
            + "The former Yugoslav Republic of Macedonia (2015), male, 98.83726\n"
            + "Maldives (2015), female, 98.85508\n"
            + "Samoa (2015), male, 98.91145\n"
            + "Croatia (2015), female, 98.92351\n"
            + "Hungary (2014), female, 98.96778\n"
            + "Republic of Moldova (2014), female, 99.02609\n"
            + "Serbia (2015), male, 99.08345\n"
            + "Romania (2015), male, 99.08576\n"
            + "Republic of Moldova (2015), female, 99.10359\n"
            + "Samoa (2015), female, 99.12479\n"
            + "Hungary (2014), male, 99.1432\n"
            + "Trinidad and Tobago (2014), male, 99.22576\n"
            + "Trinidad and Tobago (2015), male, 99.24793\n"
            + "Italy (2015), male, 99.25709\n"
            + "Tonga (2015), male, 99.34896\n"
            + "Hungary (2015), female, 99.36909\n"
            + "Kyrgyzstan (2015), female, 99.37136\n"
            + "Hungary (2015), male, 99.39419\n"
            + "Republic of Moldova (2015), male, 99.4005\n"
            + "Antigua and Barbuda (2014), female, 99.42\n"
            + "Tonga (2015), female, 99.44523\n"
            + "Montenegro (2015), male, 99.44857\n"
            + "Cyprus (2015), male, 99.46229\n"
            + "Palau (2015), male, 99.49818\n"
            + "Bosnia and Herzegovina (2014), male, 99.54244\n"
            + "Palau (2015), female, 99.5527\n"
            + "Bosnia and Herzegovina (2015), male, 99.56345\n"
            + "Turkmenistan (2014), female, 99.59742\n"
            + "Turkmenistan (2015), female, 99.62987\n"
            + "Kyrgyzstan (2015), male, 99.63789\n"
            + "Poland (2014), female, 99.64969\n"
            + "Cuba (2015), male, 99.6532\n"
            + "Croatia (2015), male, 99.65564\n"
            + "Belarus (2015), female, 99.66835\n"
            + "Poland (2015), female, 99.66921\n"
            + "Slovenia (2014), female, 99.69169\n"
            + "Republic of Moldova (2014), male, 99.69515\n"
            + "Slovenia (2015), female, 99.69795\n"
            + "Russian Federation (2015), female, 99.71294\n"
            + "Tajikistan (2014), female, 99.71615\n"
            + "Azerbaijan (2014), female, 99.71966\n"
            + "Ukraine (2014), female, 99.7208\n"
            + "Georgia (2014), female, 99.72084\n"
            + "Russian Federation (2015), male, 99.72751\n"
            + "Slovenia (2014), male, 99.72898\n"
            + "Armenia (2015), female, 99.73047\n"
            + "Slovenia (2015), male, 99.73209\n"
            + "Georgia (2015), female, 99.73382\n"
            + "Azerbaijan (2015), female, 99.73452\n"
            + "Tajikistan (2015), female, 99.73657\n"
            + "Ukraine (2015), female, 99.73971\n"
            + "Turkmenistan (2014), male, 99.75279\n"
            + "Turkmenistan (2015), male, 99.75981\n"
            + "Cuba (2015), female, 99.76822\n"
            + "Kazakhstan (2015), female, 99.77314\n"
            + "Guam (2015), male, 99.77357\n"
            + "Belarus (2015), male, 99.78625\n"
            + "Georgia (2014), male, 99.78819\n"
            + "Georgia (2015), male, 99.78908\n"
            + "Ukraine (2014), male, 99.79275\n"
            + "Ukraine (2015), male, 99.79344\n"
            + "Maldives (2015), male, 99.79553\n"
            + "Lithuania (2015), male, 99.80137\n"
            + "Kazakhstan (2015), male, 99.80433\n"
            + "Estonia (2015), female, 99.8047\n"
            + "Guam (2015), female, 99.80481\n"
            + "Armenia (2015), male, 99.81451\n"
            + "Tajikistan (2014), male, 99.82052\n"
            + "Tajikistan (2015), male, 99.82538\n"
            + "Lithuania (2015), female, 99.84133\n"
            + "Estonia (2015), male, 99.84565\n"
            + "Azerbaijan (2014), male, 99.86201\n"
            + "Latvia (2015), male, 99.87427\n"
            + "Azerbaijan (2015), male, 99.87973\n"
            + "Latvia (2015), female, 99.90771\n"
            + "Poland (2014), male, 99.90969\n"
            + "Poland (2015), male, 99.91629\n"
            + "Uzbekistan (2014), female, 99.97599\n"
            + "Uzbekistan (2014), male, 99.98519\n"
            + "Uzbekistan (2015), male, 99.99451\n"
            + "Uzbekistan (2015), female, 99.99583\n"
            + "Democratic People's Republic of Korea (2015), female, 99.99903\n"
            + "Democratic People's Republic of Korea (2015), male, 99.99947";

    @Rule
    public MockStdio io = new MockStdio();

    @Test
    public void literacyComparisonTest() throws IOException {
        LiteracyComparison.main(new String[]{});
        String[] output = io.getSysOut().split("\n");

        String[] expected = this.expected.split("\n");

        assertTrue("Output should include all the rows in the file. Now there were " + output.length, output.length >= expected.length);
        for (int i = 0; i < expected.length; i++) {
            assertTrue("It was expected that row " + (i + 1) + " would be \"" + expected[i] + "\".\nNow row  " + (i + 1) + " was \"" + output[i] + "\"", output[i].trim().equals(expected[i].trim()));
        }

    }
}