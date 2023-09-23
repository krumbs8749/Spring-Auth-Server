package com.ikram.security.job;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.ikram.security.job.Job;

public class DemoJobs {
    private final Job[] demoJobs;
    private static DemoJobs instance = null;

    public DemoJobs() {
        ObjectMapper objectMapper = new ObjectMapper();

        try {
            // JSON data provided directly in the code
            String jsonData = "[\n" +
                    "  {\n" +
                    "    \"job_title\": \"AI/ML Research Scientist\",\n" +
                    "    \"job_employer\": \"BMW Group\",\n" +
                    "    \"job_publisher\": \"LinkedIn Jobs\",\n" +
                    "    \"job_location\": \"Munich, Germany\",\n" +
                    "    \"employer_logo\": \"https://example.com/bmw_logo.png\",\n" +
                    "    \"qualifications\": [\n" +
                    "      \"Ph.D. in Machine Learning or related field\",\n" +
                    "      \"Strong programming skills in Python\",\n" +
                    "      \"Experience with deep learning frameworks (e.g., TensorFlow, PyTorch)\"\n" +
                    "    ],\n" +
                    "    \"responsibilities\": [\n" +
                    "      \"Conduct research in AI/ML algorithms\",\n" +
                    "      \"Develop and implement deep learning models using TensorFlow and PyTorch\",\n" +
                    "      \"Collaborate with cross-functional teams on AI projects\"\n" +
                    "    ],\n" +
                    "    \"description\": \"Join our research team to drive innovation in AI and ML technology.\"\n" +
                    "  },\n" +
                    "  {\n" +
                    "    \"job_title\": \"Software Quality Assurance Engineer\",\n" +
                    "    \"job_employer\": \"Continental AG\",\n" +
                    "    \"job_publisher\": \"Glassdoor Jobs\",\n" +
                    "    \"job_location\": \"Hanover, Germany\",\n" +
                    "    \"employer_logo\": \"https://example.com/continental_logo.png\",\n" +
                    "    \"qualifications\": [\n" +
                    "      \"Bachelor's degree in Computer Science or related field\",\n" +
                    "      \"ISTQB certification\",\n" +
                    "      \"Experience with test automation tools (e.g., Selenium)\"\n" +
                    "    ],\n" +
                    "    \"responsibilities\": [\n" +
                    "      \"Create test plans and test cases\",\n" +
                    "      \"Execute manual and automated tests using Selenium\",\n" +
                    "      \"Report and track software defects\"\n" +
                    "    ],\n" +
                    "    \"description\": \"Ensure the quality of our software products through rigorous testing.\"\n" +
                    "  },\n" +
                    "  {\n" +
                    "    \"job_title\": \"Blockchain Developer\",\n" +
                    "    \"job_employer\": \"SAP SE\",\n" +
                    "    \"job_publisher\": \"Indeed Jobs\",\n" +
                    "    \"job_location\": \"Berlin, Germany\",\n" +
                    "    \"employer_logo\": \"https://example.com/sap_logo.png\",\n" +
                    "    \"qualifications\": [\n" +
                    "      \"Experience with blockchain development\",\n" +
                    "      \"Proficiency in Solidity\",\n" +
                    "      \"Knowledge of Ethereum smart contract development\"\n" +
                    "    ],\n" +
                    "    \"responsibilities\": [\n" +
                    "      \"Design and implement blockchain solutions\",\n" +
                    "      \"Develop and deploy Ethereum smart contracts\",\n" +
                    "      \"Integrate blockchain technology into SAP solutions\"\n" +
                    "    ],\n" +
                    "    \"description\": \"Work on cutting-edge blockchain projects with our development team.\"\n" +
                    "  },\n" +
                    "  {\n" +
                    "    \"job_title\": \"Cloud DevOps Engineer\",\n" +
                    "    \"job_employer\": \"Siemens AG\",\n" +
                    "    \"job_publisher\": \"Monster Jobs\",\n" +
                    "    \"job_location\": \"Munich, Germany\",\n" +
                    "    \"employer_logo\": \"https://example.com/siemens_logo.png\",\n" +
                    "    \"qualifications\": [\n" +
                    "      \"Strong knowledge of AWS, Docker, and Kubernetes\",\n" +
                    "      \"Experience with CI/CD pipelines\",\n" +
                    "      \"Scripting skills in Python or Shell\"\n" +
                    "    ],\n" +
                    "    \"responsibilities\": [\n" +
                    "      \"Implement and manage AWS cloud infrastructure\",\n" +
                    "      \"Set up and maintain CI/CD pipelines\",\n" +
                    "      \"Automate infrastructure and deployment tasks\"\n" +
                    "    ],\n" +
                    "    \"description\": \"Join our team to build and maintain scalable cloud solutions.\"\n" +
                    "  },\n" +
                    "  {\n" +
                    "    \"job_title\": \"Frontend UI Developer\",\n" +
                    "    \"job_employer\": \"Zalando SE\",\n" +
                    "    \"job_publisher\": \"CareerBuilder Jobs\",\n" +
                    "    \"job_location\": \"Berlin, Germany\",\n" +
                    "    \"employer_logo\": \"https://example.com/zalando_logo.png\",\n" +
                    "    \"qualifications\": [\n" +
                    "      \"Proficiency in HTML, CSS, JavaScript\",\n" +
                    "      \"Experience with React or Angular\",\n" +
                    "      \"UI/UX design skills\"\n" +
                    "    ],\n" +
                    "    \"responsibilities\": [\n" +
                    "      \"Develop user-friendly web interfaces\",\n" +
                    "      \"Collaborate with UX designers on design and user experience\",\n" +
                    "      \"Optimize frontend performance and responsiveness\"\n" +
                    "    ],\n" +
                    "    \"description\": \"Create visually stunning and responsive web applications for our customers.\"\n" +
                    "  },\n" +
                    "  {\n" +
                    "    \"job_title\": \"Data Analyst\",\n" +
                    "    \"job_employer\": \"Volkswagen Group\",\n" +
                    "    \"job_publisher\": \"LinkedIn Jobs\",\n" +
                    "    \"job_location\": \"Wolfsburg, Germany\",\n" +
                    "    \"employer_logo\": \"https://example.com/volkswagen_logo.png\",\n" +
                    "    \"qualifications\": [\n" +
                    "      \"Bachelor's degree in Data Science or related field\",\n" +
                    "      \"Proficiency in SQL and data visualization tools (e.g., Tableau)\",\n" +
                    "      \"Statistical analysis skills\"\n" +
                    "    ],\n" +
                    "    \"responsibilities\": [\n" +
                    "      \"Analyze data and generate insights\",\n" +
                    "      \"Create data visualizations and reports\",\n" +
                    "      \"Collaborate with data engineers on data pipelines\"\n" +
                    "    ],\n" +
                    "    \"description\": \"Help us make data-driven decisions in the automotive industry.\"\n" +
                    "  },\n" +
                    "  {\n" +
                    "    \"job_title\": \"Embedded Systems Engineer\",\n" +
                    "    \"job_employer\": \"Bosch Group\",\n" +
                    "    \"job_publisher\": \"Glassdoor Jobs\",\n" +
                    "    \"job_location\": \"Stuttgart, Germany\",\n" +
                    "    \"employer_logo\": \"https://example.com/bosch_logo.png\",\n" +
                    "    \"qualifications\": [\n" +
                    "      \"Experience in embedded systems programming\",\n" +
                    "      \"Proficiency in C/C++\",\n" +
                    "      \"Knowledge of real-time operating systems\"\n" +
                    "    ],\n" +
                    "    \"responsibilities\": [\n" +
                    "      \"Design and develop embedded software for automotive applications\",\n" +
                    "      \"Optimize software for performance and resource utilization\",\n" +
                    "      \"Collaborate with hardware engineers on system integration\"\n" +
                    "    ],\n" +
                    "    \"description\": \"Work on cutting-edge automotive technologies with our team.\"\n" +
                    "  },\n" +
                    "  {\n" +
                    "    \"job_title\": \"Full Stack JavaScript Developer\",\n" +
                    "    \"job_employer\": \"Delivery Hero SE\",\n" +
                    "    \"job_publisher\": \"Indeed Jobs\",\n" +
                    "    \"job_location\": \"Berlin, Germany\",\n" +
                    "    \"employer_logo\": \"https://example.com/delivery_hero_logo.png\",\n" +
                    "    \"qualifications\": [\n" +
                    "      \"Proficiency in JavaScript, Node.js\",\n" +
                    "      \"Experience with backend frameworks (e.g., Express)\",\n" +
                    "      \"Database skills (e.g., MongoDB)\"\n" +
                    "    ],\n" +
                    "    \"responsibilities\": [\n" +
                    "      \"Develop frontend and backend components of web applications\",\n" +
                    "      \"Collaborate with product managers and designers\",\n" +
                    "      \"Implement RESTful APIs and database interactions\"\n" +
                    "    ],\n" +
                    "    \"description\": \"Join our team to create the future of food delivery technology.\"\n" +
                    "  },\n" +
                    "  {\n" +
                    "    \"job_title\": \"UX Researcher\",\n" +
                    "    \"job_employer\": \"Siemens AG\",\n" +
                    "    \"job_publisher\": \"Monster Jobs\",\n" +
                    "    \"job_location\": \"Munich, Germany\",\n" +
                    "    \"employer_logo\": \"https://example.com/siemens_logo.png\",\n" +
                    "    \"qualifications\": [\n" +
                    "      \"Background in human-computer interaction\",\n" +
                    "      \"Experience with user research methods\",\n" +
                    "      \"UX/UI design knowledge\"\n" +
                    "    ],\n" +
                    "    \"responsibilities\": [\n" +
                    "      \"Plan and conduct user research studies\",\n" +
                    "      \"Analyze user behavior and provide insights\",\n" +
                    "      \"Collaborate with designers on improving user interfaces\"\n" +
                    "    ],\n" +
                    "    \"description\": \"Shape the user experience of our products through research and insights.\"\n" +
                    "  },\n" +
                    "  {\n" +
                    "    \"job_title\": \"Big Data Engineer\",\n" +
                    "    \"job_employer\": \"SAP SE\",\n" +
                    "    \"job_publisher\": \"Glassdoor Jobs\",\n" +
                    "    \"job_location\": \"Berlin, Germany\",\n" +
                    "    \"employer_logo\": \"https://example.com/sap_logo.png\",\n" +
                    "    \"qualifications\": [\n" +
                    "      \"Experience in big data technologies (e.g., Hadoop, Spark)\",\n" +
                    "      \"Proficiency in programming languages (e.g., Java, Scala)\",\n" +
                    "      \"Data modeling and ETL skills\"\n" +
                    "    ],\n" +
                    "    \"responsibilities\": [\n" +
                    "      \"Design and build scalable data processing pipelines\",\n" +
                    "      \"Implement data transformations and ETL processes\",\n" +
                    "      \"Optimize data storage and retrieval\"\n" +
                    "    ],\n" +
                    "    \"description\": \"Work with large datasets to drive data-driven decisions.\"\n" +
                    "  },\n" +
                    "  {\n" +
                    "    \"job_title\": \"Network Security Analyst\",\n" +
                    "    \"job_employer\": \"Continental AG\",\n" +
                    "    \"job_publisher\": \"LinkedIn Jobs\",\n" +
                    "    \"job_location\": \"Hanover, Germany\",\n" +
                    "    \"employer_logo\": \"https://example.com/continental_logo.png\",\n" +
                    "    \"qualifications\": [\n" +
                    "      \"Knowledge of network security\",\n" +
                    "      \"Certifications (e.g., CISSP, CompTIA Security+)\",\n" +
                    "      \"Experience with security tools (e.g., IDS/IPS)\"\n" +
                    "    ],\n" +
                    "    \"responsibilities\": [\n" +
                    "      \"Monitor network security for threats and vulnerabilities\",\n" +
                    "      \"Investigate security incidents and breaches\",\n" +
                    "      \"Implement security measures and policies\"\n" +
                    "    ],\n" +
                    "    \"description\": \"Protect our organization from cyber threats and vulnerabilities.\"\n" +
                    "  },\n" +
                    "  {\n" +
                    "    \"job_title\": \"iOS App Developer\",\n" +
                    "    \"job_employer\": \"Volkswagen Group\",\n" +
                    "    \"job_publisher\": \"Indeed Jobs\",\n" +
                    "    \"job_location\": \"Wolfsburg, Germany\",\n" +
                    "    \"employer_logo\": \"https://example.com/volkswagen_logo.png\",\n" +
                    "    \"qualifications\": [\n" +
                    "      \"Experience in iOS app development (Swift, Objective-C)\",\n" +
                    "      \"Familiarity with iOS development tools (Xcode)\",\n" +
                    "      \"Knowledge of design patterns\"\n" +
                    "    ],\n" +
                    "    \"responsibilities\": [\n" +
                    "      \"Design and develop iOS applications for automotive use\",\n" +
                    "      \"Implement user interfaces and app functionality\",\n" +
                    "      \"Collaborate with cross-functional teams on app development\"\n" +
                    "    ],\n" +
                    "    \"description\": \"Create innovative and user-friendly iOS apps for our vehicles.\"\n" +
                    "  },\n" +
                    "  {\n" +
                    "    \"job_title\": \"Cloud Solutions Architect\",\n" +
                    "    \"job_employer\": \"Daimler AG\",\n" +
                    "    \"job_publisher\": \"Monster Jobs\",\n" +
                    "    \"job_location\": \"Stuttgart, Germany\",\n" +
                    "    \"employer_logo\": \"https://example.com/daimler_logo.png\",\n" +
                    "    \"qualifications\": [\n" +
                    "      \"Cloud architecture expertise\",\n" +
                    "      \"AWS or Azure certification\",\n" +
                    "      \"Experience with microservices architecture\"\n" +
                    "    ],\n" +
                    "    \"responsibilities\": [\n" +
                    "      \"Design and implement cloud solutions for enterprise applications\",\n" +
                    "      \"Define cloud architecture best practices\",\n" +
                    "      \"Collaborate with development teams on cloud deployments\"\n" +
                    "    ],\n" +
                    "    \"description\": \"Architect cloud solutions for the future of mobility and automotive technology.\"\n" +
                    "  },\n" +
                    "  {\n" +
                    "    \"job_title\": \"Python Developer\",\n" +
                    "    \"job_employer\": \"Zalando SE\",\n" +
                    "    \"job_publisher\": \"CareerBuilder Jobs\",\n" +
                    "    \"job_location\": \"Berlin, Germany\",\n" +
                    "    \"employer_logo\": \"https://example.com/zalando_logo.png\",\n" +
                    "    \"qualifications\": [\n" +
                    "      \"Proficiency in Python\",\n" +
                    "      \"Experience with web frameworks (e.g., Django, Flask)\",\n" +
                    "      \"Database skills (e.g., PostgreSQL, MySQL)\"\n" +
                    "    ],\n" +
                    "    \"responsibilities\": [\n" +
                    "      \"Develop and maintain Python-based web applications\",\n" +
                    "      \"Design and implement RESTful APIs\",\n" +
                    "      \"Collaborate with frontend developers on web projects\"\n" +
                    "    ],\n" +
                    "    \"description\": \"Build scalable and efficient Python web applications for e-commerce.\"\n" +
                    "  },\n" +
                    "  {\n" +
                    "    \"job_title\": \"AI Ethics Researcher\",\n" +
                    "    \"job_employer\": \"Siemens AG\",\n" +
                    "    \"job_publisher\": \"LinkedIn Jobs\",\n" +
                    "    \"job_location\": \"Munich, Germany\",\n" +
                    "    \"employer_logo\": \"https://example.com/siemens_logo.png\",\n" +
                    "    \"qualifications\": [\n" +
                    "      \"Ph.D. in Ethics or related field\",\n" +
                    "      \"AI Ethics research experience\",\n" +
                    "      \"Strong analytical and critical thinking skills\"\n" +
                    "    ],\n" +
                    "    \"responsibilities\": [\n" +
                    "      \"Conduct research on ethical AI, provide guidance on AI projects\",\n" +
                    "      \"Evaluate AI algorithms for ethical considerations\",\n" +
                    "      \"Collaborate with AI development teams on responsible AI practices\"\n" +
                    "    ],\n" +
                    "    \"description\": \"Shape the ethical considerations of AI technology in our organization.\"\n" +
                    "  }\n" +
                    "]";

            // Parse the JSON data into an array of Job objects
            demoJobs = objectMapper.readValue(jsonData, Job[].class);
        } catch (Exception e) {
            // Handle parsing exceptions
            throw new RuntimeException("Error parsing JSON data", e);
        }
    }
    public static DemoJobs getInstance() {
        if (instance == null) {
            synchronized (DemoJobs.class) {
                if (instance == null) {
                    instance = new DemoJobs();
                }
            }
        }
        return instance;
    }
    public Job[] getDemoJobs() {
        return demoJobs;
    }

}
