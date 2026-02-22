import 'package:flutter/material.dart';

class HomePage extends StatelessWidget {
  const HomePage({super.key});

  @override
  Widget build(BuildContext context) {
    return Scaffold(
      appBar: AppBar(title: const Text('클라이밍 실패 분석')),
      body: const Padding(
        padding: EdgeInsets.all(16),
        child: Column(
          crossAxisAlignment: CrossAxisAlignment.start,
          children: [
            Text('영상 업로드 후 실패 원인을 분석하세요.'),
            SizedBox(height: 12),
            Card(
              child: ListTile(
                title: Text('최근 분석 결과'),
                subtitle: Text('아직 분석 내역이 없습니다.'),
              ),
            ),
          ],
        ),
      ),
      floatingActionButton: FloatingActionButton.extended(
        onPressed: () {},
        label: const Text('영상 업로드'),
        icon: const Icon(Icons.upload_file),
      ),
    );
  }
}
