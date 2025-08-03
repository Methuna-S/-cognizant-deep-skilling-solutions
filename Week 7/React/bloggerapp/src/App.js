import React from 'react';
import CourseDetails from './components/CourseDetails';
import BookDetails from './components/BookDetails';
import BlogDetails from './components/BlogDetails';

function App() {
  return (
    <div
      style={{
        display: 'flex',
        justifyContent: 'center',
        alignItems: 'center',
        height: '100vh',
      }}
    >
      <div style={{ display: 'flex', gap: '30px' }}>
        <div style={{ paddingRight: '20px', borderRight: '4px solid green' }}>
          <CourseDetails showCourses={true} />
        </div>
        <div style={{ padding: '0 20px', borderRight: '4px solid green' }}>
          <BookDetails showBooks={true} />
        </div>
        <div style={{ paddingLeft: '20px' }}>
          <BlogDetails showBlogs={true} />
        </div>
      </div>
    </div>
  );
}

export default App;
