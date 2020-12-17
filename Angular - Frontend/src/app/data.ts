
export const data =

{
    "GroupName": "google",
    "Group": 30,
    "GstNumber": "000012123",
    "AddressLine1": "1023 alber st",
    "AddressLine2": "Po box 1234",
    "City": "regina",
    "Province": "sk",
    "Postal": "S4T 2A1",
    "InvoiceNumber": "123456",
    "InvoiceDate": "2020-12-01T00:00:00",
    "BillingSummary": {
        "LastInvoiceID": "000171",
        "LastInvoice": [
            { "PaymentDate": "2020-09-01T00:00:00", "PaymentAmount": 56.2 },
            { "PaymentDate": "2020-09-30T00:00:00", "PaymentAmount": 896.23 }
        ],
        "Balance": 1000,
        "Payment": -8215.23,
        "Outstanding": -85500055.23,
        "Premium": 8215.23,
        "Hsa": 8215.23,
        "Rst": 82153.23,
        "Gst": 82153.23,
        "Hst": 8253.23,        
        "AdminFee": 115.23,
        "AccountAdjustment": 110.23,
        "Due": 82153.23,
    },
    "BillingBreakdown": {

        "Benefit": [
            { "Benefit": "Health", "Lives": 11, "Volumes": 40000, "Total": 168.50, "Tax": 2.50, "GrandTotal": 171.00 },
            { "Benefit": "Dental", "Lives": 11, "Volumes": 40000, "Total": 168.50, "Tax": 2.50, "GrandTotal": 171.00 },
            { "Benefit": "Life", "Lives": 11, "Volumes": 40000, "Total": 168.50, "Tax": 2.50, "GrandTotal": 171.00 },
            { "Benefit": "AD&D", "Lives": 11, "Volumes": 40000, "Total": 168.50, "Tax": 2.50, "GrandTotal": 171.00 },
            { "Benefit": "Dep. Life", "Lives": 11, "Volumes": 40000, "Total": 168.50, "Tax": 2.50, "GrandTotal": 171.00 },
            { "Benefit": "STD", "Lives": 11, "Volumes": 40000, "Total": 168.50, "Tax": 2.50, "GrandTotal": 171.00 },
            { "Benefit": "LTD", "Lives": 11, "Volumes": 40000, "Total": 168.50, "Tax": 2.50, "GrandTotal": 171.00 },
            { "Benefit": "CI", "Lives": 11, "Volumes": 40000, "Total": 168.50, "Tax": 2.50, "GrandTotal": 171.00 }
        ],
        "HealthSpendingAccount": {"Benefit":"HCdSA", "Lives": 11, "Total": 875.00, "AdminFee": 168.50, "Tax": 2.50, "GrandTotal": 171.00 }
    },
    "EmployeesBreakdown": [

        {
            "Name": "avneet",
            "Id": 111111,
            "Province": "sk",
            "Coverage": [
                {
                    "Period": ["2020-11-01T00:00:00","2020-11-30T00:00:00"],                   
                    "Transaction": [
                        { "Status": "Regular", "FamilyType": "Family", "ClassName": "A", "Benefit": "Health", "Volume": "-999", "Premium": 500.00, "Tax": 65.23, "Total": 565.23 },
                        { "Status": "Regular", "FamilyType": "Single", "ClassName": "A", "Benefit": "Dental", "Volume": null, "Premium": 500.00, "Tax": 65.23, "Total": 565.23 },
                        { "Status": "Regular", "FamilyType": "Family", "ClassName": "A", "Benefit": "Basic Life", "Volume": 0, "Premium": 500.00, "Tax": 65.23, "Total": 565.23 },
                        { "Status": "Regular", "FamilyType": "Family", "ClassName": "A", "Benefit": "AD&D", "Volume": 0.00, "Premium": 500.00, "Tax": 65.23, "Total": 565.23 },
                        { "Status": "Regular", "FamilyType": "Family", "ClassName": "A", "Benefit": "Depdent Life", "Volume": 0.00, "Premium": 500.00, "Tax": 65.23, "Total": 565.23 },
                        { "Status": "Regular", "FamilyType": "Family", "ClassName": "A", "Benefit": "Weekly Indemity (STD)", "Volume": 0.00, "Premium": 500.00, "Tax": 65.23, "Total": 565.23 },
                        { "Status": "Regular", "FamilyType": "Family", "ClassName": "A", "Benefit": "LTD", "Volume": 0.00, "Premium": 500.00, "Tax": 65.23, "Total": 565.23 },
                        { "Status": "Regular", "FamilyType": "Family", "ClassName": "A", "Benefit": "Traditional Critical Illness", "Volume": 0.00, "Premium": 500.00, "Tax": 65.23, "Total": 565.23 },
                        { "Status": "Regular", "FamilyType": "Family", "ClassName": "A", "Benefit": "EFAP", "Volume": 0.00, "Premium": 500.00, "Tax": 65.23, "Total": 565.23 },
                        { "Status": "", "FamilyType": "", "ClassName": "", "Benefit": "Total: ", "Volume": 5000 , "Premium": 1414.23, "Tax": 1414.23, "Total": 1414.23 }
                    ]
                },
                {
                    "Period": ["2020-11-01T00:00:00","2020-11-30T00:00:00"],
                    "Transaction": [
                     
                    ]
                }

            ]
        },

        {
            "Name": "harry",
            "Id": 22222,
            "Province": "sk",
            "Coverage": [
                {
                    "Period": ["2020-11-01T00:00:00","2020-11-30T00:00:00"],
                    "Transaction": [
                        { "Status": "Regular", "FamilyType": "Family", "ClassName": "A", "Benefit": "Health", "Volume": 0.00, "Premium": 500.00, "Tax": 65.23, "Total": 565.23 },
                        { "Status": "Regular", "FamilyType": "Single", "ClassName": "A", "Benefit": "Dental", "Volume": 0.00, "Premium": 500.00, "Tax": 65.23, "Total": 565.23 },
                        { "Status": "Regular", "FamilyType": "Family", "ClassName": "A", "Benefit": "Basic Life", "Volume": 0.00, "Premium": 500.00, "Tax": 65.23, "Total": 565.23 },
                        { "Status": "Regular", "FamilyType": "Family", "ClassName": "A", "Benefit": "AD&D", "Volume": 0.00, "Premium": 500.00, "Tax": 65.23, "Total": 565.23 },
                        { "Status": "Regular", "FamilyType": "Family", "ClassName": "A", "Benefit": "Depdent Life", "Volume": 0.00, "Premium": 500.00, "Tax": 65.23, "Total": 565.23 },
                        { "Status": "Regular", "FamilyType": "Family", "ClassName": "A", "Benefit": "Weekly Indemity (STD)", "Volume": 0.00, "Premium": 500.00, "Tax": 65.23, "Total": 565.23 },
                        { "Status": "Regular", "FamilyType": "Family", "ClassName": "A", "Benefit": "LTD", "Volume": 0.00, "Premium": 500.00, "Tax": 65.23, "Total": 565.23 },
                        { "Status": "Regular", "FamilyType": "Family", "ClassName": "A", "Benefit": "Traditional Critical Illness", "Volume": 0.00, "Premium": 500.00, "Tax": 65.23, "Total": 565.23 },
                        { "Status": "Regular", "FamilyType": "Family", "ClassName": "A", "Benefit": "EFAP", "Volume": 0.00, "Premium": 500.00, "Tax": 65.23, "Total": 565.23 },
                        { "Status": "", "FamilyType": "", "ClassName": "", "Benefit": "Total: ", "Volume": 5000 , "Premium": 1414.23, "Tax": 1414.23, "Total": 1414.23 }

                    ]
                },
                {
                    "Period":["2020-11-01T00:00:00","2020-11-30T00:00:00"],
                    "Transaction": [
                        { "Status": "Regular", "FamilyType": "Family", "ClassName": "A", "Benefit": "Health", "Volume": null, "Premium": 500.00, "Tax": 65.23, "Total": 565.23 },
                        { "Status": "Regular", "FamilyType": "Single", "ClassName": "A", "Benefit": "Dental", "Volume": 10000, "Premium": -500.00, "Tax": -65.23, "Total": -565.23 },
                        { "Status": "", "FamilyType": "", "ClassName": "", "Benefit": "Total: ", "Volume": 5000 , "Premium": 1414.23, "Tax": 1414.23, "Total": 1414.23 }

                    ]
                }

            ]
        }
    ],

    "Hsa": {
        "ClassType": [
            {
                "ClassName": "A",
                "Period": ["2020-11-01T00:00:00","2020-11-30T00:00:00"],
                "Members": [
                    { "Name": "john", "Claims": 1500, "AdminFee": 11000,"Tax": 3000, "Total": 6500 }
                ],
                "MemberSubTotal": { "Name": "A","Claims": 1500, "AdminFee": 11000,"Tax": 3000, "Total": 6500}
            },
            {
                "ClassName": "B",
                "Period": ["2020-11-01T00:00:00","2020-11-30T00:00:00"],
                "Members": [
                    { "Name": "smith", "Claims": 1500, "AdminFee": 11000,"Tax": 3000, "Total": 6500},
                    { "Name": "julie","Claims": 1500, "AdminFee": 11000,"Tax": 3000, "Total": 6500 },
                    { "Name": "jeff", "Claims": 1500, "AdminFee": 11000,"Tax": 3000, "Total": 6500 }
                ],
                "MemberSubTotal": { "Name": "B", "Claims": 1500, "AdminFee": 11000,"Tax": 3000, "Total": 6500 }
            }
        ],
        "Total": {  "Name": "Grand Total","Claims": 1500, "AdminFee": 11000,"Tax": 3000, "Total": 6500 }

    },
    "ReturnPayment":{
        "Period": ["2020-11-01T00:00:00","2020-11-30T00:00:00"],
        "Payment": [
            { "Benefit": "Health", "Total": 168.30, "Tax": 21.88, "GrandTotal": 190.18 },
            { "Benefit": "Dental", "Total": 168.30, "Tax": 21.88, "GrandTotal": 190.18 },
            { "Benefit": "Life", "Total": 168.30, "Tax": 21.88, "GrandTotal": 190.18 },
            { "Benefit": "AD&D", "Total": 168.30, "Tax": 21.88, "GrandTotal": 190.18 },
            { "Benefit": "DependentLife", "Total": 168.30, "Tax": 21.88, "GrandTotal": 190.18 },
            { "Benefit": "Weekly Indemnity (STD) ", "Total": 168.30, "Tax": 21.88, "GrandTotal": 190.18 },
            { "Benefit": "LTD", "Total": 168.30, "Tax": 21.88, "GrandTotal": 190.18 },
            { "Benefit": "Traditional Critical Illness ", "Total": 168.30, "Tax": 21.88, "GrandTotal": 190.18 },
            { "Benefit": "EFAP", "Total": 168.30, "Tax": 21.88, "GrandTotal": 190.18 },
            { "Benefit": "Total", "Total": 1524.70, "Tax": 196.92, "GrandTotal": 1711.62 }
        ],
        "Hcsa":{
            "Period": ["2020-11-01T00:00:00","2020-11-30T00:00:00"],            
            "Payment":[
                {"Benefit":"A", "Lives": 11, "Total": 875.00, "AdminFee": 168.50, "Tax": 2.50, "GrandTotal": 171.00 },
                {"Benefit":"B", "Lives": 1, "Total": 870, "AdminFee": 168.50, "Tax": 2, "GrandTotal": 17.00 }
            ]
        },
        "Total": { "Name": "", "Claims": 1500, "AdminFee": 11000,"Tax": 30, "Total": 6500 }



    }







}