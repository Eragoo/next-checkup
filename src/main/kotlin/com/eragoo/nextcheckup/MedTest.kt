package com.eragoo.nextcheckup

class MedTest {
    var name: String? = null
    var frequency: String? = "6m"
    var type: List<MedTestType>? = null
    var description: String? = null
    var preparation: String? = null

    enum class MedTestType {
        GENERAL, CANCER, REPRODUCTIVE,
    }


    companion object {
        fun defaults(): List<MedTest> {
            return listOf(
                MedTest().apply { name = "Blood Pressure"
                    frequency = "1y"
                    type = listOf(MedTestType.GENERAL)
                    description = "Blood pressure is the pressure of circulating blood on the walls of blood vessels."
                    preparation = "Avoid Caffeine and Smoking, rest before test."
                }
                , MedTest().apply { name = "Blood Sugar"
                    frequency = "1y"
                    type = listOf(MedTestType.GENERAL)
                    description = "Blood sugar, or glucose, is the main sugar found in your blood."
                    preparation = "Fasting for 8 hours before the test."
                }
                , MedTest().apply { name = "Cholesterol"
                    frequency = "1y"
                    type = listOf(MedTestType.GENERAL)
                    description = "Cholesterol is a waxy, fat-like substance that's found in all the cells in your body."
                    preparation = "Fasting for 8 hours before the test."
                }
                , MedTest().apply {
                    name = "Pap Smear"
                    frequency = "3y"
                    type = listOf(MedTestType.REPRODUCTIVE, MedTestType.CANCER)
                    description =
                        "The Pap smear is a vital preventive measure, as it can detect abnormal cells early, long before they become cancerous."
                    preparation =
                        "Avoid intercourse, douching, or using any vaginal medicines or spermicidal foams, creams or jellies for two days before the test."
                }
                , MedTest().apply {
                    name = "Diabetes Screening"
                    frequency = "1y"
                    type = listOf(MedTestType.GENERAL)
                    description =
                        "Diabetes screening is a test that checks for diabetes or prediabetes in adults."
                    preparation = "Fasting for 8 hours before the test."
                }
                , MedTest().apply {
                    name = "Bone Density Test"
                    frequency = "2y"
                    type = listOf(MedTestType.GENERAL)
                    description =
                        "A bone density test determines if you have osteoporosis — a disorder characterized by bones that are more fragile and more likely to break."
                    preparation = "No special preparation is needed."
                }
                , MedTest().apply {
                    name = "Skin Cancer Screening"
                    frequency = "1y"
                    type = listOf(MedTestType.CANCER)
                    description =
                        "Skin cancer screening is a visual exam of the skin that is performed by a dermatologist or other healthcare professional."
                    preparation = "No special preparation is needed."
                }
            )
        }
    }
}