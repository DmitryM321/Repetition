package LeetcodeAndOtherTasks;

import java.util.ArrayList;
import java.util.List;

public class  Restore_IP_Addresses {
    public static void main(String[] args) {
     String   s = "25525511135";
     System.out.println(restoreIpAddresses(s));
    }
 public static List<String> restoreIpAddresses(String s) {
    List<String> validIPs = new ArrayList<>();
    restoreIPHelper(s, 4, new StringBuilder(), validIPs);
    return validIPs;
}

private static void restoreIPHelper(String s, int numSegments, StringBuilder currentIP, List<String> validIPs) {
    if (numSegments == 0 && s.isEmpty()) {
        validIPs.add(currentIP.toString());
        return;
    } else if (numSegments == 0 || s.isEmpty()) {
        return;
    }

    for (int i = 1; i <= Math.min(s.length(), 3); i++) {
        String segment = s.substring(0, i);
        int segmentValue = Integer.parseInt(segment);

        if (segmentValue > 255 || (segment.length() > 1 && segment.startsWith("0"))) {
            continue;
        }

        StringBuilder newIP = new StringBuilder(currentIP);
        if (newIP.length() > 0) {
            newIP.append(".");
        }
        newIP.append(segment);

        restoreIPHelper(s.substring(i), numSegments - 1, newIP, validIPs);
    }
}
}