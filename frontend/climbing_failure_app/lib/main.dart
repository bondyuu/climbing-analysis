import 'package:flutter/material.dart';

import 'features/home/home_page.dart';

void main() {
  runApp(const ClimbingFailureApp());
}

class ClimbingFailureApp extends StatelessWidget {
  const ClimbingFailureApp({super.key});

  @override
  Widget build(BuildContext context) {
    return MaterialApp(
      title: 'Climbing Failure Analyzer',
      theme: ThemeData(
        colorScheme: ColorScheme.fromSeed(seedColor: Colors.indigo),
        useMaterial3: true,
      ),
      home: const HomePage(),
    );
  }
}
