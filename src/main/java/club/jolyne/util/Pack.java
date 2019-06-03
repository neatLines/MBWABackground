package club.jolyne.util;

import club.jolyne.models.PackageEntity;

public class Pack {
    public static PackageEntity pack(Object date, String message) {
        PackageEntity packageEntity = new PackageEntity();
        if (null == date) {
            packageEntity.setCode(-1);
            packageEntity.setMessage("no response");
        } else {
            packageEntity.setCode(0);
            packageEntity.setMessage(message);
        }
        packageEntity.setDate(date);
        packageEntity.setLogin(true);
        return packageEntity;
    }
}
