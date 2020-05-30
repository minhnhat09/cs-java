import java.util.Deque;
import java.util.Iterator;
import java.util.LinkedList;

public class NormalizePathName {
  public static String shortestEquivalentPath(String path) {
    if (path.equals("")) {
      throw new IllegalArgumentException("Empty String");
    }
    Deque<String> pathNames = new LinkedList<>();
    if (path.startsWith("/")) {
      pathNames.addFirst("/");
    }
    for (String token : path.split("/")) {
      if (token.equals("..")) {
        if (pathNames.isEmpty() || pathNames.peekFirst().equals("..")) {
          pathNames.addFirst(token);
        } else {
          if (pathNames.peekFirst().equals("/")) {
            throw new IllegalArgumentException("Path error");
          }
          pathNames.removeFirst();
        }
      } else if (!token.equals(".") && !token.isEmpty()) {
        pathNames.addFirst(token);
      }
    }

    StringBuilder stringBuilder = new StringBuilder();
    if (!pathNames.isEmpty()) {
      Iterator<String> it = pathNames.descendingIterator();
      String prev = it.next();
      stringBuilder.append(prev);
      while (it.hasNext()) {
        if (!prev.equals("/")) {
          stringBuilder.append("/");
        }
        prev = it.next();
        stringBuilder.append(prev);
      }
    }
    return stringBuilder.toString();
  }
}
